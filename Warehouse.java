import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

/*
This class, as the inventory to the warehouse, must be able to accept a large, current register
of the warehouse after an audit, and it is used to add new products to the warehouse.

The addition of the POI library was necessary as java does not have a direct api with excel,
which is the program the master product list was provided through. Support documentation was
gathered at this link: https://www.javatpoint.com/how-to-read-excel-file-in-java


 */
public class Warehouse {
    String City;
    String State;
    String Street;
    int Zipcode;
    String Name;
    String ManagerID;
    int ContactNumber;

    Warehouse() throws FileNotFoundException {
        try {
            FileInputStream in = new FileInputStream(new File("/Users/Glurp/Downloads"));
            HSSFWorkbook workBook=new HSSFWorkbook(in);
            HSSFSheet sheet=workBook.getSheetAt(0);

            int counter=0;
            for(Row row: sheet)     //iteration over row using for each loop
            {
                String status="", description="", vendor="", String, Date="";
                int productID=0, onHand=0,sold=0,reserved=0;
                LocalDate shipment=LocalDate.parse("0000-00-00");
                int c=0;
                for (Cell cell : row)    //iteration over cell using for each loop
                {
                    switch (c){
                        case 0:
                            status= cell.getStringCellValue();
                            break;
                        case 1:
                            productID=(int)cell.getNumericCellValue();
                            break;
                        case 2:
                            description= cell.getStringCellValue();
                            break;
                        case 3:
                            vendor=cell.getStringCellValue();
                            break;
                        case 12:
                            onHand= (int) cell.getNumericCellValue();
                            break;
                        case 13:
                            sold=(int)cell.getNumericCellValue();
                            break;
                        case 14:
                            Date=cell.getStringCellValue();
                            shipment= LocalDate.parse(Date.substring(0,5)+"-"+Date.substring(5,8)+"-"+Date.substring(8));
                            break;
                        case 15:
                            reserved=(int)cell.getNumericCellValue();
                            break;
                        default:
                            break;
                    }
                    new Product(status,productID,description,vendor,onHand,sold,shipment,reserved);
                }
                if (counter>=300){
                    break;
                }
                counter++;
            }
                } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void assignManager(String managerID){
        ManagerID=managerID;
    }
}
