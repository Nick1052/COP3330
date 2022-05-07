import java.util.Date;

public class Transaction {

    // Data fields
    private String parts;
    private String description;
    private java.util.Date date;
    private String mileage;
    private double amount;

    // Constructor
    public Transaction(String parts, String description, double amount, String mileage) {

        this.parts = parts;
        this.description = description;
        this.amount = amount;
        this.mileage = mileage;
        date = new Date();

    }

    // Methods
    public void setParts(String parts) { this.parts = parts; }
    public void setDescription(String description) { this.description = description; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getParts() { return parts; }
    public String getDescription() { return description; }
    public double getAmount() { return amount; }
    public String getMileage() { return mileage;}
    public java.util.Date getDate() { return date; }

    public void printWholeTransaction() {

        System.out.println("\nParts : " + getParts() + "\tDate: "+ getDate());
        System.out.println("Description : " + getDescription());
        System.out.println("Mileage: " + getMileage());
        System.out.printf("Amount: %.2f\n", getAmount());

    }

}
