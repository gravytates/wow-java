import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartsWithG {
    public static void main(String[] args) {
        System.out.println("What's your name deary?");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputName = bufferedReader.readLine();
            if (inputName.startsWith("G")) {
                System.out.println("Cool G.");
            } else {
                System.out.println("...");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
