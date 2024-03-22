package MultiplexEntities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.ColumnDefault;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;
    private String contactInformation;
    private String paymentInformation;
    @ColumnDefault("'A'")
    private char status;

    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings = new ArrayList<>();

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getPaymentInformation() {
        return paymentInformation;
    }

    public void setPaymentInformation(String paymentInformation) {
        this.paymentInformation = paymentInformation;
    }
    public Customer(Long customerId,String name, String contactInformation, String paymentInformation) {
    	super();
        this.customerId=customerId;
        this.name = name;
        this.contactInformation = contactInformation;
        this.paymentInformation = paymentInformation;
    }
    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Customer() {
    	super();
    }
    public String toString() {
        return "Customer [customerId=" + customerId + ", name=" + name + ", contactInformation=" + contactInformation + ", paymentInformation=" + paymentInformation + "]";
    }

    }
    	
  
