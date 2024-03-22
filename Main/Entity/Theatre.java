package MultiplexEntities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import java.util.List;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "Theatre")
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long theatreId;
    private String name;
    private String location;
    @ColumnDefault("'A'")
    private char status;
    @OneToMany(mappedBy = "theatre")
    private List<Movie> movies;
    @OneToMany(mappedBy = "theatre")
    private List<Screen>screens ;
    public Long getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(Long theatreId) {
        this.theatreId = theatreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }
    public Theatre(Long theatreId,String name,String location) {
    	super();
    	this.theatreId = theatreId;
    	this.name =name;
    	this.location=location;
    }
    public Theatre() {
    	super();
    }
    

	public String toString() {
    	return "Theatre [TheatreId=" + theatreId + ", name=" + name + ", location=" + location + "]";
	}
    }


   
