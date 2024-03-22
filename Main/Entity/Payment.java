package MultiplexEntities;
import javax.persistence.Entity;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    private String paymentMethod;
    private Date paymentDate;
    private double amount;
    private String transactionStatus;
    @ColumnDefault("'A'")
    private char status;
  
    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
    public Payment() {
    	super();
    }

    public Payment(Long paymentId,String paymentMethod, Date paymentDate, double amount, String transactionStatus) {
    	super();
    	this.paymentId=paymentId;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.transactionStatus = transactionStatus;
    }
    public String ToString() {
    	return  "Payment[paymentId="+paymentId+",paymentMethod="+paymentMethod+",paymentDate="+paymentDate+",amount="+amount+",transactionStatus="+transactionStatus+"]";
    }
}


  

