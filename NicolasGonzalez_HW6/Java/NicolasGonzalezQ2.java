import java.io.IOException;
import java.util.Scanner;

public class NicolasGonzalezQ2 {
    public static void main(String[] args) {

        try {
            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            Scanner input = new Scanner(url.openStream());

            int charCount = 0;

            while(input.hasNext()) {
                if (Character.isLetter(input.nextInt()))
                    charCount++;
            }

            System.out.print("The number of words in the link is "+ charCount);
        }
        catch (java.net.MalformedURLException ex) {
            System.out.print("Wrong Url");
        }
        catch (java.net.ConnectException ex) {
            System.out.print("Could not connect to website.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
