import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UglyColor {
    public static void main(String[] args) {
        System.out.println("Name an ugly ass color");

        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputString = bufferedReader.readLine();

            System.out.println("Ugly ass color listed: " + inputString + ".\nGood choice. Ugly AF.");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
