package MultiplexServiceImplementation;

import java.util.List;
import MultiplexEntities.Theatre;
import MultiplexDAO.TheatreDAO;
import MultiplexDAOImplementation.TheatreDAOImpl;
import MultiplexService.TheatreService;
public class TheatreServiceImpl implements TheatreService {

    private TheatreDAO theatreDAO;

    public TheatreServiceImpl(TheatreDAO theatreDAO) {
        this.theatreDAO = theatreDAO;
    }

    @Override
    public boolean saveTheatre(Theatre theatre) {
        return theatreDAO.saveTheatre(theatre);
    }

    @Override
    public List<Theatre> getAllTheatres() {
        return theatreDAO.getAllTheatres();
    }

    @Override
    public Theatre getTheatreById(int theatreId) {
        return theatreDAO.getTheatreById(theatreId);
    }

    @Override
    public boolean updateTheatre(Theatre theatre) {
        return theatreDAO.updateTheatre(theatre);
    }

    @Override
    public boolean deleteTheatre(int theatreId) {
        return theatreDAO.deleteTheatre(theatreId);
    }
}

