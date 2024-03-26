package MultiplexDAO;
import java.util.List;
import MultiplexEntities.Ticket;



public interface TicketDAO {
   
    boolean saveTicket(Ticket ticket);
    
    List<Ticket> getAllTickets();
    
    Ticket getTicketByNumber(String ticketNumber);
    
    boolean updateTicket(Ticket ticket);
    
    boolean deleteTicket(String ticketNumber);
}


