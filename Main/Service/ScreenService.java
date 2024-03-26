package MultiplexService;

import java.util.List;
import MultiplexEntities.Screen;

public interface ScreenService {
   
    boolean saveScreen(Screen screen);
    
    List<Screen> getAllScreens();
    
    Screen getScreenByNumber(String screenNumber);
    
    boolean updateScreen(Screen screen);
    
    boolean deleteScreen(String screenNumber);
}





