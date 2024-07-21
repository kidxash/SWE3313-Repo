import java.util.ArrayList;

public class LoadAssignment {
    String customerID;
    String warehouseID;
    String DriverID;
    final String LoadID;
    static int LoadIDCount=0;
    ArrayList<Product> productList;

    LoadAssignment(ArrayList<Product> productList){
        for (Product i: productList){
            this.productList.add(i);
        }
        LoadIDCount++;
        LoadID=Warehouse.getWarehouseID()+String.format("%03d",LoadIDCount);
    }
}
