package MultiplexEntities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.ColumnDefault;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    private double totalPrice;
    private Showtime showtime;
    private Long CustomerId;
    private Date bookingDate;
    @ColumnDefault("'A'")
    private char status;

    @OneToMany(mappedBy = "booking")
    private List<Payment> payments = new ArrayList<>();

    @OneToMany(mappedBy = "booking")
    private List<Ticket> tickets = new ArrayList<>();
    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomer( Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
    public List<Ticket> getTickets() {
        return tickets;
    }
    public void setTicket(List<Ticket>tickets) {
    	this.tickets=tickets;
    }

    public Booking(Long CustomerId,Long bookingId,double totalPrice, Date bookingDate, Showtime showtime, Customer customer) {
    	super();
    	this.bookingId=bookingId;
        this.totalPrice = totalPrice;
        this.bookingDate = bookingDate;
        this.showtime = showtime;
        this.CustomerId = CustomerId;
    }
    public Booking() {
    	super();
    }
    public String ToString() {
    	return "Booking[bookngId="+bookingId+",totalPrice="+totalPrice+",bookingDate="+bookingDate+",showtime="+showtime+",CustomerId="+CustomerId+"]";
    	
    }
    	
    }

