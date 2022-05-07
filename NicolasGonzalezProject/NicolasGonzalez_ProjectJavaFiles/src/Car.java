// Car class, includes all the car details most mechanic shops would need

public class Car {

    // Data fields
    private String serialNumber;
    private String color;
    private String make;
    private String mileage;
    private String year;
    private String model;

    // Constructions
    public Car() {
        serialNumber = "XXXXXXXXXXXXXXXXX";
        color = "UNKNOWN";
        model = "UNKNOWN";
        make = "UNKNOWN";
        year = "UNKNOWN";
        mileage = "UNKNOWN";
    }
    public Car(String serialNumber) {

        this.serialNumber = serialNumber;
        color = "UNKNOWN";
        model = "UNKNOWN";
        make = "UNKNOWN";
        year = "UNKNOWN";
        mileage = "UNKNOWN";
    }
    public Car(String serialNumber, String mileage) {
        this.serialNumber = serialNumber;
        this.mileage = mileage;
    }
    public Car(String serialNumber, String color, String model, String make, String mileage, String year) {

        this.serialNumber = serialNumber;
        this.color = color;
        this.model = model;
        this.make = make;
        this.mileage = mileage;
        this.year = year;
    }

    // Methods
    public void setMileage(String mileage) { this.mileage = mileage; }
    public void setColor(String color) { this.color = color; }
    public void setYear(String year) { this.year = year; }
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }

    public void printInfo() {

        System.out.println("Make: " + make + "\t\tModel: " + model);
        System.out.println("Years: " + year + "\t\t\tColor: " + color);
        System.out.println("Mileage: " + mileage);
        System.out.println("SerialNumber: " + serialNumber + "\n");

    }
}
