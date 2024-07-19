public class Customer {
    String First_Name;
    String Last_Name;
    int Contact_num;
    String Email;
    String Street;
    String State;
    String City;
    int Zipcode;
    String Loading_cap;
    String CustomerID;

    Customer(String rawdata){
        String[] Customerdata=rawdata.split(",",9);
        First_Name=Customerdata[0];
        Last_Name=Customerdata[1];
        Contact_num=Integer.getInteger(Customerdata[2]);
        Email=Customerdata[3];
        Street=Customerdata[4];
        State=Customerdata[5];
        City=Customerdata[6];
        Zipcode=Integer.getInteger(Customerdata[7]);
        Loading_cap=Customerdata[8];
    }

    public void setAddress(){

    }
}
