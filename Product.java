import java.text.DateFormat;
import java.text.Format;
import java.time.LocalDate;
import java.util.Date;

public class Product {
    String Status;
    final int ProductID;
    String Description;
    String Vendor;
    int onHand;
    int reserved;
    int sold;
    LocalDate LastShipment;


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
