package MultiplexEntities;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "ticket")
public class Ticket {

    private String seatNo;
    private String ticketNumber;
    private String Ticketstatus;
    
    @ColumnDefault("'A'")
    private char status;

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

    public String getTicketStatus() {
        return Ticketstatus;
    }

    public void setStatus(String Ticketstatus) {
        this.Ticketstatus = Ticketstatus;
    }
    public Ticket(String seatNo, String ticketNumber, String Ticketstatus) {
    	super();
        this.seatNo = seatNo;
        this.ticketNumber = ticketNumber;
        this.Ticketstatus = Ticketstatus;
    }
    public Ticket() {
    	super();
    }
    public String toString() {
    	return "Ticket[seatNo="+seatNo+",ticketNumber="+ticketNumber+",Ticketstatus="+Ticketstatus+"]";
    
    }
    }