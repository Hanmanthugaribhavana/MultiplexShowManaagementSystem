package MultiplexDAOImplementation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;
import MultiplexEntities.Theatre;
import MultiplexDAO.TheatreDAO;


public class TheatreDAOImpl implements TheatreDAO {

    private SessionFactory sessionFactory;

    public TheatreDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public boolean saveTheatre(Theatre theatre) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(theatre);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Theatre> getAllTheatres() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Theatre", Theatre.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Theatre getTheatreById(int theatreId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Theatre.class, theatreId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean updateTheatre(Theatre theatre) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(theatre);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteTheatre(int theatreId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Theatre theatre = session.get(Theatre.class, theatreId);
            if (theatre != null) {
                session.delete(theatre);
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
