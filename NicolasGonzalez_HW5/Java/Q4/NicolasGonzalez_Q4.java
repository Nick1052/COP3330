import java.util.Date;
import java.util.Scanner;

public class NicolasGonzalez_Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Ten accounts
        Account[] accounts = new Account[10];
        int exit = 0;

        // Initialize accounts with balance of 100
        initialBalance(accounts);

        // ID loop
        do {
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            if (isValidID(id, accounts)) {
                int choice;
                do {
                    // Get user choice
                    choice = displayMainMenu(input);
                    if (isTransaction(choice)) {
                        executeTransaction(choice, accounts, id, input);
                    }
                } while (choice != 4); // If 4 exit main menu
            }
            System.out.println("Would you like to end the program? Enter: -1");
            exit = input.nextInt();
        } while (exit != -1);
    }
    public static void initialBalance(Account[] a) {
        int initialBalance = 100;
        for (int i = 0; i < a.length; i++) {
            a[i] = new Account(i, initialBalance);
        }
    }
    public static boolean isTransaction(int choice) {
        return choice > 0 && choice < 4;
    }

    public static boolean isValidID(int id, Account[] a) {
        for (int i = 0; i < a.length; i++) {
            if (id == a[i].getId())
                return true;
        }
        return false;
    }
    public static int displayMainMenu(Scanner input) {
        System.out.print("\nMain menu\n1: check balance\n2: withdraw" + "\n3: deposit\n4: exit\nEnter a choice: ");
        return input.nextInt();
    }
    public static void executeTransaction(
            int c, Account[] a, int id, Scanner input) {
        switch (c) {
            case 1 -> System.out.println("The balance is " + a[id].getBalance());
            case 2 -> {
                System.out.print("Enter an amount to withdraw: ");
                a[id].withdraw(input.nextDouble());
            }
            case 3 -> {
                System.out.print("Enter an amount to deposit: ");
                a[id].deposit(input.nextDouble());
            }
        }
    }
}

class Account {
    // Data fields
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    // Constructors

    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }
    //========\\
    // Methods \\
    //=========\\
    public void setId(int newId) {
        id = newId;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public String getDateCreated() {
        return dateCreated.toString();
    }
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }
}