package MultiplexServiceImplementation;
import java.util.List;
import MultiplexEntities.Customer;
import MultiplexDAO.CustomerDAO;
import MultiplexDAOImplementation.CustomerDAOImpl;
import MultiplexService.CustomerService;


public class CustomerServiceImpl implements CustomerService {

    private CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public boolean saveCustomer(Customer customer) {
        return customerDAO.saveCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }

    @Override
    public Customer getCustomerById(int customerId) {
        return customerDAO.getCustomerById(customerId);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerDAO.updateCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        return customerDAO.deleteCustomer(customerId);
    }
}
