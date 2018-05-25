import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mealness {
    public static void main(String[] args) {

            askWhatYouAteFor("breakfast");
            askWhatYouAteFor("lunch");
            askWhatYouAteFor("Supper");

    }

    public static void askWhatYouAteFor(String meal){
        try{

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What did you eat for " + meal + "?");
            String inputMeal = bufferedReader.readLine();
            System.out.println(inputMeal + " for " + meal + "? Okay...");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
