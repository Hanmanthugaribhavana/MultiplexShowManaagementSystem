package multiplextheatremanagementsystem;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;
    private String seatNo;
    private String ticketNumber;
    private double price;
    private String status;

    @ManyToOne
    private Booking booking;

    // Getters and Setters
    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Ticket(Long ticketId,String seatNo, String ticketNumber, double price, String status) {
    	super();
    	this.ticketId=ticketId;
        this.seatNo = seatNo;
        this.ticketNumber = ticketNumber;
        this.price = price;
        this.status = status;
    }
    public Ticket() {
    	super();
    }
    public String toString() {
    	return "Ticket[ticketId="+ticketId+",seatNo="+seatNo+",ticketNumber="+ticketNumber+",price="+price+",status="+status+"]";
    
    }
    }