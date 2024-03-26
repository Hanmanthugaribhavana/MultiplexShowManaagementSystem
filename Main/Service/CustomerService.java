package MultiplexService;

import java.util.List;
import MultiplexEntities.Customer;

public interface CustomerService {
   
    boolean saveCustomer(Customer customer);
    
    List<Customer> getAllCustomers();
    
    Customer getCustomerById(int customerId);
    
    boolean updateCustomer(Customer customer);
    
    boolean deleteCustomer(int customerId);
}




