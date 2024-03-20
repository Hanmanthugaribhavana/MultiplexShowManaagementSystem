package multiplextheatremanagementsystem;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.OneToMany;


@Entity
@Table(name="Screen")
public class Screen {

    private int ScreenNumber;
    private int Capacity;
    private String AudioSystem;
    private String VisualSystem;
    @OneToMany(mappedBy = "screen")
    private Showtime showtime;
   
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



    	
    	


