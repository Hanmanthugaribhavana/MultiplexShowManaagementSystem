package MultiplexDAOImplementation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;
import MultiplexEntities.Screen;
import MultiplexDAO.ScreenDAO;


public class ScreenDAOImpl implements ScreenDAO {

    private SessionFactory sessionFactory;

    public ScreenDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public boolean saveScreen(Screen screen) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(screen);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Screen> getAllScreens() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Screen", Screen.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Screen getScreenByNumber(String screenNumber) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Screen where screenNumber = :screenNumber", Screen.class)
                          .setParameter("screenNumber", screenNumber)
                          .uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean updateScreen(Screen screen) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(screen);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteScreen(String  screenNumber) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Screen screen = getScreenByNumber(screenNumber);
            if (screen != null) {
                session.delete(screen);
                transaction.commit();
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
