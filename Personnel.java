public class Personnel {
    String personnelID;
    String email;
    int ContactNumber;
    String name;

    //Personnel will be Loaded in by Driver
    Personnel()
    {

    }
     Personnel(String person, String gmail, int ContactNum, String n)
    {
        personnelID = person;
        email = gmail;
        ContactNumber = ContactNum;
        name = n;
    }
    
}
