package MultiplexServiceImplementation;

import java.util.List;
import MultiplexEntities.Ticket;
import MultiplexDAO.TicketDAO;
import MultiplexDAOImplementation.TicketDAOImpl;
import MultiplexService.TicketService;

public class TicketServiceImpl implements TicketService {

    private TicketDAO ticketDAO;

    public TicketServiceImpl(TicketDAO ticketDAO) {
        this.ticketDAO = ticketDAO;
    }

    @Override
    public boolean saveTicket(Ticket ticket) {
        return ticketDAO.saveTicket(ticket);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketDAO.getAllTickets();
    }

    @Override
    public Ticket getTicketByNumber(String ticketNumber) {
        return ticketDAO.getTicketByNumber(ticketNumber);
    }

    @Override
    public boolean updateTicket(Ticket ticket) {
        return ticketDAO.updateTicket(ticket);
    }

    @Override
    public boolean deleteTicket(String ticketNumber) {
        return ticketDAO.deleteTicket(ticketNumber);
    }
}
