package multiplextheatremanagementsystem;
import javax.persistence.Entity;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

@Entity
@Table(name="Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    private String title;
    private Date releaseDate;
    private int duration;
    private String language;
    @OneToMany(mappedBy = "movie")
    private Screen screen;
    

    
    // Getters and Setters
    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

public Movie(Long movieId,String title,String language,Date releasedate, int duration) {
	super();
	this.movieId = movieId;
	this.title =title;
	this.releaseDate=releasedate;
	this.duration=duration;
	this.language=language;
			
	
}
public Movie() {
	super();
	
}
public String toString() {
	return "Movie [MoviId=" + movieId + ", title=" + title + ", duration=" + duration + ",releaseDate="+releaseDate+",language="+language+"]";
}
}



 
