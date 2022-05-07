import java.util.ArrayList;
import java.util.Scanner;

public class MechanicRecords {

    static Admin admin = new Admin(); // Declaring the admin class first things first. The admin class contains the User and Password
    static Scanner input = new Scanner(System.in); // Scanner declared globally to avoid putting it in all functions
    static ArrayList<Person> persons = new ArrayList<>(); // Dynamic Array that works as a DataBase
    static ArrayList<StoreBills> store = new ArrayList<>(); // Dynamic Array that works as a Database

    // Pre-conditions: None
    // Post-conditions: Determine if the admin/owner is trying to access the database. If admin continue and exit with code 0. If not the admin/owner, exit with code 1
    public static void main(String[] args) {

        int tries = 4;

        while(!entryMenu()){
            System.out.println("\nWrong Password/ID.......\nEnter again. You have " + --tries +" tries left\n");

            if(tries == 0)
                System.exit(1);
        }

        System.out.println("\nCorrect Password/ID. Access Granted.....\n");

        while(menu());

        System.exit(0);
    }

    // Pre-conditions: Nothing needed to be passed. The admin class is declared globally and immutable
    // Post-conditions: Returns if the user inputted the right ID and Password to Access the program
    public static boolean entryMenu() {

        System.out.println("\tWelcome to Manny's Mechanic Shop");
        System.out.println("------------------------------------");
        System.out.print("Please Enter ID: ");
        String id = input.nextLine();
        System.out.print("Please Enter password: ");
        String password = input.nextLine();

        return admin.isAdmin(id, password);

    }

    // Pre-conditions: Nothing needed to be passed.
    // Post-conditions: Various functions based on what the shop owner/user wants to do
    public static boolean menu() {

        System.out.println("\n\tPlease Choose an option");
        System.out.println("------------------------------------");
        System.out.println("1. Add customer");
        System.out.println("2. Search customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Print Customers");
        System.out.println("5. view store transaction menu");
        System.out.println("6. Exit");

        int option = Integer.parseInt(input.nextLine());
        String name;

        switch(option) {
            case 1:
                System.out.print("Please Enter the Persons name: ");
                name = input.nextLine();

                persons.add(new Person(name));
                return true;
            case 2:
                System.out.print("Please Enter the Persons name you would like to search for: ");
                name = input.nextLine();

                for(int i = 0; i < persons.size(); i++)
                    if(persons.get(i).compareName(name)) {
                        System.out.println("Person Exists......");
                        return true;
                    }

                System.out.println("Person not found....");
                return true;
            case 3:
                System.out.print("Please Enter the Persons name you would like to edit: ");
                name = input.nextLine();

                Person temp = null;

                for(int i = 0; i < persons.size(); i++)
                    if(persons.get(i).compareName(name))
                        temp = persons.get(i);

                if(temp == null) {
                    System.out.println("\n" + name + " is not in the database!\n");
                    return true;
                }

                while(editPerson(temp));

                return true;
            case 4:
                System.out.println();

                if(persons.size() == 0) {
                    System.out.println("No persons in the database.\nReturning.....");
                    return true;
                }
                for(int i = 0; i < persons.size(); i++)
                    System.out.println(i +": " + persons.get(i).getName());

                return true;
            case 5:
                while(storeTransaction());
                return true;
            case 6:
                System.out.print("Exiting...");
                return false;
            default:
                System.out.print("Wrong Option.... Exiting....");
                return false;
        }
    }

    // Pre-conditions: The person class you want to edit
    // Post-condition: Various functions based on what you want to edit on the persons class
    public static boolean editPerson(Person person) {

        System.out.println("\nCustomer's name: " + person.getName());
        System.out.println("\n\tPlease Choose an option");
        System.out.println("------------------------------------");
        System.out.println("1. Add car");
        System.out.println("2. Remove car");
        System.out.println("3. Add transaction");
        System.out.println("4. Edit transaction");
        System.out.println("5. Print Cars");
        System.out.println("6. Edit Cars");
        System.out.println("7. Print Transactions");
        System.out.println("8. Exit to main menu");

        int choice = Integer.parseInt(input.nextLine());

        switch(choice) {
            case 1:
                person.addCar();
                return true;
            case 2:
                person.removeCar();
                return true;
            case 3:
                person.addTransaction();
                return true;
            case 4:
                person.editTransaction();
                return true;
            case 5:
                person.printCars();
                return true;
            case 6:
                person.editCars();
                return true;
            case 7:
                person.printTransaction();
                return true;
            case 8:
                System.out.println("Exiting to main menu...\n");
                return false;
            default:
                System.out.println("\nWrong choice\nReturning.....");
                return false;
        }



    }

    // Pre-conditions:Nothing needed to be passed. The dynamic ArrayList is accessed from the global variables
    // Post-conditions: Various functions based on what you want to edit on the StoreBills class
    public static boolean storeTransaction() {


        System.out.println("\n\tPlease Choose an option for the Stores Bill");
        System.out.println("------------------------------------------------------");
        System.out.println("1. Add transaction");
        System.out.println("2. Edit transaction");
        System.out.println("3. View transactions");
        System.out.println("4. Remove transaction");
        System.out.println("5. View total store balance");
        System.out.println("6. Exit to main menu");

        int choice = Integer.parseInt(input.nextLine());

        switch(choice) {
            case 1:
                System.out.println("\nPlease Enter the following information: ");
                System.out.print("Type of purchase [Purchase, Refund, Investment, Other]: ");
                String purchase = input.nextLine();
                System.out.print("Description: ");
                String description = input.nextLine();
                System.out.print("Amount: ");
                double amount = Double.parseDouble(input.nextLine());

                store.add(new StoreBills(purchase, description, amount));
                System.out.println("\nTransaction added!");
                return true;
            case 2:

                if(store.size() == 0) {
                    System.out.println("\nNo transactions in the database\nReturning.....");
                    return true;
                }
                for(int i = 0; i < store.size(); i++) {
                    System.out.println("\n\t\tStore Transaction #" + i);
                    System.out.println("----------------------------------------------------");
                    store.get(i).printBill();
                }
                System.out.println("\nWhat transaction would you like to edit?");
                int index = Integer.parseInt(input.nextLine());
                StoreBills temp = store.get(index);

                System.out.println("\nChoose what you would like to edit....");
                System.out.println("1. Change purchase type [Purchase, Refund, Investment, Other]");
                System.out.println("2. Change description");
                System.out.println("3. Change amount");
                System.out.println("4. Exit to main menu");

                choice = Integer.parseInt(input.nextLine());

                switch(choice) {
                    case 1:
                        System.out.println("\nEnter the new purchase type [Purchase, Refund, Investment, Other]: ");
                        String changePurchase = input.nextLine();
                        temp.setPurchase(changePurchase);
                        System.out.println("\nPurchase type changed....\nReturning....");
                        break;
                    case 2:
                        System.out.println("\nEnter the new description: ");
                        String changeDescription = input.nextLine();
                        temp.setDescription(changeDescription);
                        System.out.println("\nDescription changed....\nReturning....");
                        break;
                    case 3:
                        System.out.println("\nEnter the new amount: ");
                        double changeAmount = Double.parseDouble(input.nextLine());
                        temp.setAmount(changeAmount);
                        System.out.println("\nAmount changed....\nReturning....");
                        break;
                    case 4:
                        System.out.println("Returning to store bill menu");
                        break;
                    default:
                        System.out.println("Wrong choice....\nReturning to store bill menu");
                }
                return true;
            case 3:

                if(store.size() == 0) {
                    System.out.println("\nNo transactions in the database\nReturning.....");
                    return true;
                }
                for(int i = 0; i < store.size(); i++) {
                    System.out.println("\n\t\tStore Transaction #" + i);
                    System.out.println("------------------------------------");
                    store.get(i).printBill();
                }

                return true;
            case 4:

                if(store.size() == 0) {
                    System.out.println("\nNo transactions in the database\nReturning.....");
                    return true;
                }

                for(int i = 0; i < store.size(); i++) {
                    System.out.println("\n\t\tStore Transaction #" + i);
                    System.out.println("------------------------------------");
                    store.get(i).printBill();
                }

                System.out.print("\nWhich transaction would you like to delete: ");
                int delIndex = Integer.parseInt(input.nextLine());

                store.remove(delIndex);

                System.out.println("Transaction removed!\nReturning.....");
                return true;
            case 5:
                double balance = 0;

                for(int i = 0; i < store.size(); i++)
                    balance += store.get(i).getAmount();

                System.out.printf("\nThe store balance is: %.2f\n", balance);

                return true;
            case 6:
                System.out.println("\nExiting to main menu...");
                return false;
            default:
                System.out.println("\nWrong choice\nReturning to main menu");
                return false;
        }
    }
}
