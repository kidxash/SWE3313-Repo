import java.util.ArrayList;

public class LoadAssignment {
    String PersonnelID;
    String warehouseID;
    String DriverID;
    final String LoadID;
    static int LoadIDCount=0;
    ArrayList<Order> orderList;

    LoadAssignment(String PersonnelID, String warehouseID, String DriverID){
        this.PersonnelID=PersonnelID;
        this.warehouseID=warehouseID;
        this.DriverID=DriverID;

        LoadIDCount++;
        LoadID=Warehouse.getWarehouseID()+String.format("%03d",LoadIDCount);
    }

    public void addOrders(ArrayList<Order> OrderList){
        for (Order i: OrderList){
            this.orderList.add(i);
        }
    }
    public void addOrder(Order i){
        orderList.add(i);
    }
    public void removeOrder(Order i){
        orderList.remove(i);
    }
}
