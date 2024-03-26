package MultiplexService;

import java.util.List;
import MultiplexEntities.Payment;


public interface PaymentService {
   
    boolean savePayment(Payment payment);
    
    List<Payment> getAllPayments();
    
    Payment getPaymentById(int paymentId);
    
    boolean updatePayment(Payment payment);
    
    boolean deletePayment(int paymentId);
}


