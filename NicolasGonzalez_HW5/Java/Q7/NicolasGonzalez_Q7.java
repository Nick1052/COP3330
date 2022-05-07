import java.util.Calendar;
import java.util.GregorianCalendar;

public class NicolasGonzalez_Q7 {

    public static void main(String[] args) {

        // Creatubg objects
        Person person = new Person("Nick", "UCF", "7862223699", "Nick1052@knights.ucf.edu");
        Student student = new Student("Mike", "UCF2", "2222222222", "Mike@email.com", Student.FRESHMAN);
        Employee employee = new Employee("Mike2", "UCF3", "66666666666", "mike2@EMAIL.com", 111, 100000);
        Faculty faculty = new Faculty("Mike3", "UCF4", "444444444", "mike3@EMAIL.com", 112, 150000, "12am - 12 am", "Professor");
        Staff staff = new Staff("Mike4", "UCF5", "33333333333", "mike4@EMAIL.com", 113, 165000, "Some Job");

        // Print
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}
class MyDate {
    // Data Fields
    private int year;
    private int month;
    private int day;

    // Constructors
    MyDate() {
        GregorianCalendar cal = new GregorianCalendar();
        year = cal.get(GregorianCalendar.YEAR);
        month = cal.get(GregorianCalendar.MONTH);
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    }
    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }
    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //=========\\
    // Methods \\
    //=========\\

    // Modified String Get Methods
    public int getYear() {
        return year;
    }
    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }
    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }

    // setDate using the elapsed time.
    public void setDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(GregorianCalendar.YEAR);
        month = cal.get(GregorianCalendar.MONTH);
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
class Person {
    // Data Fields
    private String name;
    private String address;
    private String phone;
    private String email;

    // Constructors
    Person() {
        this("Unknown","Unknown","Unknown","Unknown");
    }
    Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    //=========\\
    // Methods \\
    //=========\\

    // Getter methods
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phone + "\nEmail address: " + email;
    }
}
class Student extends Person {
    // Data Fields
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 3;
    public final static int JUNIOR = 2;
    public final static int SENIOR = 4;

    // Constructor
    Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }
    //=========\\
    // Methods \\
    //=========\\
    public void setStatus(int status) {
        this.status = status;
    }
    public String getStatus() {
        return switch (status) {
            case 1 -> "freshman";
            case 2 -> "sophomore";
            case 3 -> "junior";
            case 4 -> "senior";
            default -> "Unknown";
        };
    }
    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
}
class Employee extends Person {
    // Data Fields
    private int office;
    private double salary;
    private MyDate dateHired;

    // Constructor
    Employee(String name, String address, String phone, String email, int office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }
    //=========\\
    // Methods \\
    //=========\\
    public int getOffice() {
        return office;
    }
    public String getSalary() {
        return String.format("%.2f", salary);
    }
    public String getDateHired() {
        return dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
    }
    public void setOffice(int office) {
        this.office = office;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDateHired() {
        dateHired = new MyDate();
    }
    public String toString() {
        return super.toString() + "\nOffice: " + office +
                "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
    }
}
class Faculty extends Employee {
    // Data fields
    private String officeHours;
    private String rank;

    // Constructors
    Faculty(String name, String address, String phone, String email, int office, double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    //=========\\
    // Methods \\
    //=========\\
    public String getOfficeHours() {
        return officeHours;
    }
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours + "\nRank: " + rank;
    }
}
class Staff extends Employee {
    // Data Fields
    private String title;

    // Constructors
    Staff(String name, String address, String phone, String email, int office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }
    //=========\\
    // Methods \\
    //=========\\
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}