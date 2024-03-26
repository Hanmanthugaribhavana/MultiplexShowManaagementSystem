package MultiplexService;
import java.util.List;

import MultiplexEntities.Booking;


public interface BookingService {
   
    boolean saveBooking(Booking booking);
    
    List<Booking> getAllBookings();
    
    Booking getBookingById(int bookingId);
    
    boolean updateBooking(Booking booking);
    
    boolean deleteBooking(int bookingId);
}






