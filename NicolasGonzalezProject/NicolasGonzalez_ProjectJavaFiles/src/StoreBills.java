import java.util.Date;

// storeBills class, includes the details of the storeBills
public class StoreBills {

    // Data fields
    private String purchase;
    private String description;
    private double amount;
    private java.util.Date date;

    // Constructors
    public StoreBills(String purchase, String description, double amount) {

        this.purchase = purchase;
        this.description = description;
        this.amount = amount;
        date = new Date();
    }

    // Methods
    public void setPurchase(String purchase) { this.purchase = purchase; }
    public void setDescription(String description) { this.description = description; }
    public void setAmount(double amount) { this.amount = amount; }

    public double getAmount() { return amount; }

    public void printBill() {

        System.out.println("Purchase Type : " + purchase + "\tDate: "+ date);
        System.out.println("Description : " + description);
        System.out.printf("Amount: %.2f\n", amount);
    }
}
