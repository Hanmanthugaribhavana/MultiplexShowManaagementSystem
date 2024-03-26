package MultiplexDAO;
import java.util.List;
import MultiplexEntities.Showtime;



public interface ShowtimeDAO {
   
    boolean saveShowtime(Showtime showtime);
    
    List<Showtime> getAllShowtimes();
    
    Showtime getShowtimeById(int showtimeId);
    
    boolean updateShowtime(Showtime showtime);
    
    boolean deleteShowtime(int showtimeId);
}



