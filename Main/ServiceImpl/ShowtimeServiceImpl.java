package MultiplexServiceImplementation;
import java.util.List;
import MultiplexEntities.Showtime;
import MultiplexDAO.ShowtimeDAO;
import MultiplexDAOImplementation.ShowtimeDAOImpl;
import MultiplexService.ShowtimeService;

public class ShowtimeServiceImpl implements ShowtimeService {

    private ShowtimeDAO showtimeDAO;

    public ShowtimeServiceImpl(ShowtimeDAO showtimeDAO) {
        this.showtimeDAO = showtimeDAO;
    }

    @Override
    public boolean saveShowtime(Showtime showtime) {
        return showtimeDAO.saveShowtime(showtime);
    }

    @Override
    public List<Showtime> getAllShowtimes() {
        return showtimeDAO.getAllShowtimes();
    }

    @Override
    public Showtime getShowtimeById(int showtimeId) {
        return showtimeDAO.getShowtimeById(showtimeId);
    }

    @Override
    public boolean updateShowtime(Showtime showtime) {
        return showtimeDAO.updateShowtime(showtime);
    }

    @Override
    public boolean deleteShowtime(int showtimeId) {
        return showtimeDAO.deleteShowtime(showtimeId);
    }
}

