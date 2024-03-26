package MultiplexDAOImplementation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;
import MultiplexEntities.Showtime;
import MultiplexDAO.ShowtimeDAO;


public class ShowtimeDAOImpl implements ShowtimeDAO {

    private SessionFactory sessionFactory;

    public ShowtimeDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public boolean saveShowtime(Showtime showtime) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(showtime);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Showtime> getAllShowtimes() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Showtime", Showtime.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Showtime getShowtimeById(int showtimeId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Showtime.class, showtimeId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean updateShowtime(Showtime showtime) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(showtime);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteShowtime(int showtimeId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Showtime showtime = session.get(Showtime.class, showtimeId);
            if (showtime != null) {
                session.delete(showtime);
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
