package MultiplexDAO;
import java.util.List;
import MultiplexEntities.Booking;

public interface BookingDAO {
   
    boolean saveBooking(Booking booking);
    
    List<Booking> getAllBookings();
    
    Booking getBookingById(int bookingId);
    
    boolean updateBooking(Booking booking);
    
    boolean deleteBooking(int bookingId);
}

