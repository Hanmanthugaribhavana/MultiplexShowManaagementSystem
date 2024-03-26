package MultiplexService;

import java.util.List;
import MultiplexEntities.Showtime;

public interface ShowtimeService {
   
    boolean saveShowtime(Showtime showtime);
    
    List<Showtime> getAllShowtimes();
    
    Showtime getShowtimeById(int showtimeId);
    
    boolean updateShowtime(Showtime showtime);
    
    boolean deleteShowtime(int showtimeId);
}
