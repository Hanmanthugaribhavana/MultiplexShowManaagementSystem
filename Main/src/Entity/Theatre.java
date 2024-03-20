package multiplextheatremanagementsystem;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Theatre")
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long theatreId;
    private String name;
    private String location;

    @OneToMany(mappedBy = "theatre")
    private List<Movie> movies = new ArrayList<>();
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


    