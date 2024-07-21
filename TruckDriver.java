public class TruckDriver {
    String City;
    String State;
    String Street;
    int Zipcode;
    String Name;
    String DriverID;
    int ContactNumber;
    String truckType;

    //TruckDriver will be Loaded in by Driver
    TruckDriver(String city, String state, String street, int zipcode, String name, String driverID, int contactNumber, String trucktype){
        City=city;
        State=state;
        Street=street;
        Zipcode=zipcode;
        Name=name;
        DriverID=driverID;
        ContactNumber=contactNumber;
        truckType=trucktype;

    }
}
