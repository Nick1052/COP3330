import java.util.ArrayList;
import java.util.Scanner;

// Person class
// Includes a database of their cars and transaction
public class Person {

    // Data fields
    private String name;
    ArrayList<Transaction> history;
    ArrayList<Car> cars;

    // Constructor
    public Person(String name) {

         this.name = name;
         history = new ArrayList<>();
         cars = new ArrayList<>();
     }

    // Methods
    public String getName() { return name; }

    public void addCar() {

         Scanner input = new Scanner(System.in);
         String serialNumber;
         String mileage;
         String color;
         String model;
         String make;
         String year;

         System.out.println("\n\t Please choose a format to enter......");
         System.out.println("1. No Inputs");
         System.out.println("2. Serial Number");
         System.out.println("3. Serial number - Mileage");
         System.out.println("4. Serial number - Color - Model - Make - Mileage - Year");

         int choice = Integer.parseInt(input.nextLine());

         switch(choice) {
             case 1:
                 cars.add(new Car());
                 System.out.print("\nCar has been added!");
                 return;
             case 2:
                 System.out.print("\nPlease enter a 17 character serial number: ");
                 serialNumber = input.nextLine();
                 cars.add(new Car(serialNumber));
                 System.out.println("\nCar has been added!");
                 return;
             case 3:
                 System.out.print("\nPlease enter a 17 character serial number: ");
                 serialNumber = input.nextLine();
                 System.out.print("Please enter the mileage: ");
                 mileage = input.nextLine();
                 cars.add(new Car(serialNumber, mileage));
                 System.out.println("\nCar has been added!");
                 return;
             case 4:
                 System.out.print("\nPlease enter a 17 character serial number: ");
                 serialNumber = input.nextLine();
                 System.out.print("Please enter the color: ");
                 color = input.nextLine();
                 System.out.print("Please enter the model: ");
                 model = input.nextLine();
                 System.out.print("Please enter the make: ");
                 make = input.nextLine();
                 System.out.print("Please enter the mileage: ");
                 mileage = input.nextLine();
                 System.out.print("Please enter the year: ");
                 year = input.nextLine();
                 cars.add(new Car(serialNumber, color, model, make, mileage, year));
                 System.out.println("\nCar has been added!\n");
                 return;
             default:
                 System.out.print("Wrong Choice!\nReturning....\n");
         }

    }
    public void removeCar() {

         Scanner input = new Scanner(System.in);

        if(cars.size() == 0) {
            System.out.println("No history found!\nReturning.....");
            return;
        }
         printCars();

         System.out.print("\nWhich car would you like to delete? Selected a number: ");
         int choice = Integer.parseInt(input.nextLine());

         if(choice >= cars.size() || choice < 0) {
             System.out.println("Wrong choice.\nReturning....");
             return;
         }
         cars.remove(choice);
         System.out.print("Car has been removed!");
    }
    public void editCars() {

        Scanner input = new Scanner(System.in);

        if(cars.size() == 0) {
            System.out.println("No cars found!\nReturning.....");
            return;
        }
        printCars();
        System.out.print("Select a car to edit....: ");
        int index = Integer.parseInt(input.nextLine());

        if(index >= cars.size() || index < 0) {
            System.out.println("\nWrong choice.\nReturning....");
            return;
        }
        Car temp = cars.get(index);

        System.out.println("\nWhat would you like to edit about this car?");
        System.out.println("1. Mileage");
        System.out.println("2. Color");
        System.out.println("3. Year");
        System.out.println("4. Make");
        System.out.println("5. Model");
        System.out.println("6. SerialNumber");
        System.out.println("7. Exit");

        int choice = Integer.parseInt(input.nextLine());

        switch(choice) {
            case 1:
                System.out.print("\nEnter the new mileage: ");
                String mileage = input.nextLine();
                temp.setMileage(mileage);
                System.out.println("\nMileage was changed...\nReturning....");
                return;
            case 2:
                System.out.print("\nEnter the new color: ");
                String color = input.nextLine();
                temp.setColor(color);
                System.out.println("\nColor was changed...\nReturning....");
                return;
            case 3:
                System.out.print("\nEnter the new year: ");
                String year = input.nextLine();
                temp.setYear(year);
                System.out.println("\nYear was changed...\nReturning....");
                return;
            case 4:
                System.out.print("\nEnter the new make: ");
                String make = input.nextLine();
                temp.setMake(make);
                System.out.println("\nMake was changed...\nReturning....");
                return;
            case 5:
                System.out.print("\nEnter the new model: ");
                String model = input.nextLine();
                temp.setModel(model);
                System.out.println("\nModel was changed...\nReturning....");
                return;
            case 6:
                System.out.print("\nEnter the new serial number: ");
                String serialNumber = input.nextLine();
                temp.setSerialNumber(serialNumber);
                System.out.println("\nSerial Number was changed...\nReturning....");
                return;
            case 7:
                System.out.println("\nReturning to main menu");
                return;
            default:
                System.out.println("\nWrong choice....\nReturning to person menu");
        }
    }
    public void printCars(){

        if(cars.size() == 0) {
            System.out.println("No cars. \nReturning.....");
            return;
        }
        for(int i = 0 ; i < cars.size(); i++) {
            System.out.println("\t\tCar #" + i);
            System.out.println("------------------------------------");
            cars.get(i).printInfo();
        }
    }

    public void addTransaction() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the following details.....");
        System.out.print("Part/s name: ");
        String parts = input.nextLine();

        System.out.print("Description: ");
        String description = input.nextLine();

        System.out.print("Amount: ");
        double amount = Double.parseDouble(input.nextLine());

        System.out.print("Mileage: ");
        String mileage = input.nextLine();

        history.add(new Transaction(parts, description, amount, mileage));

        System.out.println("\nTransaction has been added....\nReturning.....");

    }
    public void editTransaction() {

         Scanner input = new Scanner(System.in);

         if(history.size() == 0) {
             System.out.println("No history found!\nReturning.....");
             return;
         }
         printTransaction();

         System.out.print("Select a transaction to edit....: ");
         int index = Integer.parseInt(input.nextLine());

        if(index >= history.size() || index < 0) {
            System.out.println("\nWrong choice.\nReturning....");
            return;
        }

        Transaction temp = history.get(index);

        System.out.println("\nEdit Transaction: ");
        System.out.println("1. set Part(s)");
        System.out.println("2. set Description");
        System.out.println("3. set Amount");
        System.out.println("4. Exit to person menu");

        int choice = Integer.parseInt(input.nextLine());

        switch(choice) {
            case 1:
                System.out.print("Enter the new Part(s): ");
                String parts = input.nextLine();
                temp.setParts(parts);
                System.out.println("\nPart(s) has been changed....\nReturning.....\n");
                return;
            case 2:
                System.out.print("Enter the new Description: ");
                String description = input.nextLine();
                temp.setDescription(description);
                System.out.println("\nDescription has been changed....\nReturning.....\n");
                return;
            case 3:
                System.out.print("Enter the new Amount: ");
                double amount = Double.parseDouble(input.nextLine());
                temp.setAmount(amount);
                System.out.println("\nAmount has been changed....\nReturning.....\n");
                return;
            case 4:
                System.out.print("\nExiting to person menu.");
        }
    }
    public void printTransaction() {

         if(history.size() == 0) {
             System.out.println("No history found!\nReturning.....");
             return;
         }

         for(int i = 0; i < history.size(); i++) {
             System.out.println("\t\tTransaction #" + i);
             System.out.println("------------------------------------");
             history.get(i).printWholeTransaction();
         }
    }

    public boolean compareName(String name) { return this.name.equals(name); }
}
