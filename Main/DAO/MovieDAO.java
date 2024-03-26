package MultiplexDAO;
import java.util.List;
import MultiplexEntities.Movie;


public interface MovieDAO {
   
    boolean saveMovie(Movie movie);
    
    List<Movie> getAllMovies();
    
    Movie getMovieById(int movieId);
    
    boolean updateMovie(Movie movie);
    
    boolean deleteMovie(int movieId);
}

