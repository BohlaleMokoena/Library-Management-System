public class MemberManager {
    private String name;
    private String email;
    private String phoneNo;
    private String ID;

    public MemberManager(String inName, String inEmail, String inPhoneNo, String inID) {
        this.name = inName;
        this.email = inEmail;
        this.phoneNo = inPhoneNo;
        this.ID = inID;
    }//End of constructor

    public String getName() {
        return name;
    }//End of getName

    public String getEmail() {
        return email;
    }//End of getEmail

    public String getPhoneNo() {
        return phoneNo;
    }//End of getPhoneNo

    public String getID() {
        return ID;
    }//End of getID

    public void setID(String ID) {
        this.ID = ID;
    }//End of setID;

    public String toString() {
        return "Name: " + name + " Email: " + email + " Phone: " +
                phoneNo + " ID: " + ID;
    }//End of toString
}//End of MemberManager
