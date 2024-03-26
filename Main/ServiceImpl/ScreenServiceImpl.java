package MultiplexServiceImplementation;
import java.util.List;
import MultiplexEntities.Screen;
import MultiplexDAO.ScreenDAO;
import MultiplexDAOImplementation.ScreenDAOImpl;
import MultiplexService.ScreenService;


public class ScreenServiceImpl implements ScreenService {

    private ScreenDAO screenDAO;

    public ScreenServiceImpl(ScreenDAO screenDAO) {
        this.screenDAO = screenDAO;
    }

    @Override
    public boolean saveScreen(Screen screen) {
        return screenDAO.saveScreen(screen);
    }

    @Override
    public List<Screen> getAllScreens() {
        return screenDAO.getAllScreens();
    }

    @Override
    public Screen getScreenByNumber(String screenNumber) {
        return screenDAO.getScreenByNumber(screenNumber);
    }

    @Override
    public boolean updateScreen(Screen screen) {
        return screenDAO.updateScreen(screen);
    }

    @Override
    public boolean deleteScreen(String screenNumber) {
        return screenDAO.deleteScreen(screenNumber);
    }
}

