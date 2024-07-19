import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class Inventory {
    String Status;
    int ProductID;
    String containerName;
    String Name;
    String brand;
    String Vendor;
    int onHand;
    int reserved;

    Inventory() throws FileNotFoundException {
        try {
            FileInputStream in = new FileInputStream(new File("/Users/Glurp/Downloads"));


        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
