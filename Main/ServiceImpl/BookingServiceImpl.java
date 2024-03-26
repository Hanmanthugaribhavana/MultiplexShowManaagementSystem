package MultiplexServiceImplementation;
import java.util.List;
import MultiplexEntities.Booking;
import MultiplexDAO.BookingDAO;
import MultiplexDAOImplementation.BookingDAOImpl;
import MultiplexService.BookingService;


public class BookingServiceImpl implements BookingService {

    private BookingDAO bookingDAO;

    public BookingServiceImpl(BookingDAO bookingDAO) {
        this.bookingDAO = bookingDAO;
    }

    @Override
    public boolean saveBooking(Booking booking) {
        return bookingDAO.saveBooking(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }

    @Override
    public Booking getBookingById(int bookingId) {
        return bookingDAO.getBookingById(bookingId);
    }

    @Override
    public boolean updateBooking(Booking booking) {
        return bookingDAO.updateBooking(booking);
    }

    @Override
    public boolean deleteBooking(int bookingId) {
        return bookingDAO.deleteBooking(bookingId);
    }
}

