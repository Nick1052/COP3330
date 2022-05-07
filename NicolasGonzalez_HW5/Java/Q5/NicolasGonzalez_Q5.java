import java.util.Calendar;
import java.util.GregorianCalendar;

public class NicolasGonzalez_Q5 {

    public static void main(String[] args) {

        // Example
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println("Date1 - Month: " + date1.getMonth() + " Day: " + date1.getDay() + " Year: " + date1.getYear());
        System.out.println("Date2 - Month: " + date2.getMonth() + " Day: " + date2.getDay() + " Year: " + date2.getYear());

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
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);

    }
    MyDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
    }
    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //=========\\
    // Methods \\
    //=========\\
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    // setDate using the elapsed time.
    public void setDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
    }
}