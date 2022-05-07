import java.util.Scanner;
import java.io.File;

public class NicolasGonzalezQ3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a directory to create (Ex: C:/user/..../dir): ");
        File file = new File(input.next());

        if(!file.exists()) {
            if(file.mkdir())
                System.out.print("Directory created successfully...");
        }
        else
            System.out.print("Directory already existed.....");
    }
}
