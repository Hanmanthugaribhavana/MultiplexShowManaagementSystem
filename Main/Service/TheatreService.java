package MultiplexService;

import java.util.List;
import MultiplexEntities.Theatre;

public interface TheatreService {
   
    boolean saveTheatre(Theatre theatre);
    
    List<Theatre> getAllTheatres();
    
    Theatre getTheatreById(int theatreId);
    
    boolean updateTheatre(Theatre theatre);
    
    boolean deleteTheatre(int theatreId);
}


