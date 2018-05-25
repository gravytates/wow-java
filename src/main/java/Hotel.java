import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Hotel {
    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What season are you booking a stay?");
            String season = bufferedReader.readLine();

            System.out.println("On the weekend, or weeknight?");
            String dayOfWeek = bufferedReader.readLine();

            boolean summer = season.equals("summer");
            boolean weekend = dayOfWeek.equals("weekend");

            if (summer && weekend) {
                System.out.println("Spendy AF being summer and weekend.");
            } else if (summer && !weekend) {
                System.out.println("Spendy summer rates, but not weekend at least.");
            } else if (!summer && weekend) {
                System.out.println("Nice cool weekend coming up! Summer sucks anyway.");
            } else {
                System.out.println("You cheap as shit.");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
