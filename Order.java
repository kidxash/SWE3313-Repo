import java.util.ArrayList;

public class Order {
    String customerID;
    String warehouseID;
    final String orderID;
    static int orderIDCount=0;
    ArrayList<int> productList;

    Order(ArrayList<int> productList){
        for (int i: productList){

        }
        orderIDCount++;
        orderID=Warehouse.getWarehouseID()+String.format("%03d",orderIDCount);
    }
}
