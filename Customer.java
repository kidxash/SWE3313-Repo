import java.util.*;

public class Customer {
    String FirstName;
    String LastName;
    int customerPhone;
    String Email;
    String Street;
    String State;
    String City;
    int Zipcode;
    String Loading_cap;
    String CustomerID;
    static int customerIDCount=0;

    Customer(String rawData){
        String[] Customerdata=rawData.split(",",9);
        FirstName=Customerdata[0];
        LastName=Customerdata[1];
        customerPhone=Integer.getInteger(Customerdata[2]);
        Email=Customerdata[3];
        Street=Customerdata[4];
        State=Customerdata[5];
        City=Customerdata[6];
        Zipcode=Integer.getInteger(Customerdata[7]);
        Loading_cap=Customerdata[8];
        if (FirstName.length()>4&&LastName.length()>4){
            CustomerID=FirstName.substring(0,4).toLowerCase()+LastName.substring(0,2).toLowerCase()+"_"+String.format("%03d",customerIDCount);

        } else {
            CustomerID=FirstName.substring(0,2).toLowerCase()+LastName.substring(0,1).toLowerCase()+"_"+String.format("%03d",customerIDCount);
        }
        customerIDCount++;
    }

    public void setAddress(){

    }
}
