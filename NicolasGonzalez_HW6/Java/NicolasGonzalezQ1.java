import java.util.Random;
import java.util.Scanner;

public class NicolasGonzalezQ1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();

        int[] arr = new int[100];

        for(int i = 0; i < 100; i++)
            arr[i] = r.nextInt();
        System.out.print("Enter an index for the array: ");
        int i = input.nextInt();
        try {
            System.out.println("The corresponding element value in Arr["+ i +"] = " + arr[i]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index "+ i +" is out of bounds!");
        }
    }
}
