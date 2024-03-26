package MultiplexServiceImplementation;

import java.util.List;
import MultiplexEntities.Movie;
import MultiplexDAO.MovieDAO;
import MultiplexDAOImplementation.BookingDAOImpl;
import MultiplexService.MovieService;

public class MovieServiceImpl implements MovieService {

    private MovieDAO movieDAO;

    public MovieServiceImpl(MovieDAO movieDAO) {
        this.movieDAO = movieDAO;
    }

    @Override
    public boolean saveMovie(Movie movie) {
        return movieDAO.saveMovie(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieDAO.getAllMovies();
    }

    @Override
    public Movie getMovieById(int movieId) {
        return movieDAO.getMovieById(movieId);
    }

    @Override
    public boolean updateMovie(Movie movie) {
        return movieDAO.updateMovie(movie);
    }

    @Override
    public boolean deleteMovie(int movieId) {
        return movieDAO.deleteMovie(movieId);
    }
}
