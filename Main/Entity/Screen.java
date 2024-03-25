package MultiplexEntities;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.OneToMany;


@Entity
@Table(name="Screen")
public class Screen {

    private int ScreenNumber;
    private int Capacity;
    private String AudioSystem;
    private String VisualSystem;
    @ColumnDefault("'A'")
    private char status;
    
    @OneToMany(mappedBy = "screen")
    private List<Showtime> showtimes = new ArrayList<>();
    public int getScreenNumber() {
        return ScreenNumber;
    }

    public void setScreenNumber(int screenNumber) {
        this.ScreenNumber = screenNumber;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        this.Capacity = capacity;
    }

    public String getAudioSystem() {
        return AudioSystem;
    }

    public void setAudioSystem(String audioSystem) {
        this.AudioSystem = audioSystem;
    }

    public String getVisualSystem() {
        return VisualSystem;
    }

    public void setVisualSystem(String visualSystem) {
        this.VisualSystem = visualSystem;
    }
    public List<Showtime> getShowtimes() {
        return showtimes;
    }

    public void setShowtimes(List<Showtime> showtimes) {
        this.showtimes = showtimes;
    }
    public Screen(String AudioSystem, String VisualSystem, int Capacity,int ScreenNumber) {
    	super();
    	this.AudioSystem=AudioSystem;
    	this.Capacity=Capacity;
    	this.VisualSystem=VisualSystem;
    	this.ScreenNumber=ScreenNumber;
    }
    public Screen() {
    	super();
    }

    public String tostring() {
    	return "Screen[AudoSystem="+AudioSystem+",Capacity="+Capacity+",VisualSystem="+VisualSystem+",ScreenNumber="+ScreenNumber+"]";
    }
}




