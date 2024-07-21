import java.text.DateFormat;
import java.text.Format;
import java.time.LocalDate;
import java.util.Date;

public class Product {
    private String Status;
    private final int ProductID;
    private String Description;
    private String Vendor;
    private int onHand;
    private int reserved;
    private int sold;
    private LocalDate LastShipment;


    Product(String status, int productID, String description, String vendor, int onHand, int sold, LocalDate lastShipment, int reserved ){
        ProductID=productID;
        Status=status;
        Description=description;
        Vendor=vendor;
        this.onHand=onHand;
        this.sold=sold;
        LastShipment=lastShipment;
        this.reserved=reserved;
    }
}
