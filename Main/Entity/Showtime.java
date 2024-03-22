package MultiplexEntities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import org.hibernate.annotations.ColumnDefault;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "showtime")
public class Showtime {

   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date date;
    private String time;
    private double ticketPrice;
    private int availableSeats;
    private Movie movie;
   @ColumnDefault("'A'")
    private char status;
    @OneToMany(mappedBy = "showtime")
    private List<Ticket> tickets = new ArrayList<>();
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
   public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Showtime(Date date, String time, double ticketPrice, int availableSeats) {
    	super();
    
        this.date = date;
        this.time = time;
        this.ticketPrice = ticketPrice;
        this.availableSeats = availableSeats;
    }
public Showtime() {
	super();
}
public String toString() {
	return "Showtime[movie="+movie+",date="+date+",time="+time+",ticketPrice="+ticketPrice+",availableSeats="+availableSeats+"]";
}
}

