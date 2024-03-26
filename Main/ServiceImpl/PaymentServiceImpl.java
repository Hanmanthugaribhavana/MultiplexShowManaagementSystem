
package MultiplexServiceImplementation;
import java.util.List;
import MultiplexEntities.Payment;
import MultiplexDAO.PaymentDAO;
import MultiplexDAOImplementation.PaymentDAOImpl;
import MultiplexService.PaymentService;


public class PaymentServiceImpl implements PaymentService {

    private PaymentDAO paymentDAO;

    public PaymentServiceImpl(PaymentDAO paymentDAO) {
        this.paymentDAO = paymentDAO;
    }

    @Override
    public boolean savePayment(Payment payment) {
        return paymentDAO.savePayment(payment);
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentDAO.getAllPayments();
    }

    @Override
    public Payment getPaymentById(int paymentId) {
        return paymentDAO.getPaymentById(paymentId);
    }

    @Override
    public boolean updatePayment(Payment payment) {
        return paymentDAO.updatePayment(payment);
    }

    @Override
    public boolean deletePayment(int paymentId) {
        return paymentDAO.deletePayment(paymentId);
    }
}
