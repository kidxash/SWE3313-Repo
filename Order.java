import java.util.ArrayList;

public class Order {
    String customerID;
    String warehouseID;
    String PersonnelID;
    final String orderID;
    static int orderIDCount=0;
    ArrayList<Product> productList;

    Order(String customerID, String warehouseID, String personnelID){
        this.customerID=customerID;
        this.warehouseID=warehouseID;
        PersonnelID=personnelID;

        orderIDCount++;
        orderID=Warehouse.getWarehouseID()+String.format("%03d",orderIDCount);
    }

    Order(ArrayList<Product> productList){
        for (Product i: productList){
            this.productList.add(i);
        }
        orderIDCount++;
        orderID=Warehouse.getWarehouseID()+String.format("%03d",orderIDCount);
    }

    public void addProduct(Product i){
        productList.add(i);
    }
}
