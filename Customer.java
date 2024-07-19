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

    Customer(String rawdata){
        String[] Customerdata=rawdata.split(",",9);
        FirstName=Customerdata[0];
        LastName=Customerdata[1];
        customerPhone=Integer.getInteger(Customerdata[2]);
        Email=Customerdata[3];
        Street=Customerdata[4];
        State=Customerdata[5];
        City=Customerdata[6];
        Zipcode=Integer.getInteger(Customerdata[7]);
        Loading_cap=Customerdata[8];
    }
}
