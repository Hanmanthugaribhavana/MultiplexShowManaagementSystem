package MultiplexDAO;
import java.util.List;
import MultiplexEntities.Payment;



public interface PaymentDAO {
   
    boolean savePayment(Payment payment);
    
    List<Payment> getAllPayments();
    
    Payment getPaymentById(int paymentId);
    
    boolean updatePayment(Payment payment);
    
    boolean deletePayment(int paymentId);
}

