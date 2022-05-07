// Note: This class is meant to be immutable

public class Admin {

    // Data Field
    protected final String ID = "Manny";
    protected final String PASSWORD = "Sowma1!";

    // Constructor
    public Admin() {}

    public boolean isAdmin(String id, String password) { return ID.equals(id) && PASSWORD.equals(password); }
}
