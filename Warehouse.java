import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
This class, as the inventory to the




 */
public class Warehouse {
    String Status;
    int ProductID;
    String containerName;
    String Name;
    String brand;
    String Vendor;
    int onHand;
    int reserved;

    Warehouse() throws FileNotFoundException {
        try {
            FileInputStream in = new FileInputStream(new File("/Users/Glurp/Downloads"));


        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
