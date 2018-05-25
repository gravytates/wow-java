import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class RatedARGH {

    public static void main(String[] args) {
        System.out.println("How old you is?");
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Integer integerUserAge = Integer.parseInt(bufferedReader.readLine());
            if ( integerUserAge >= 17 ) {
                System.out.println("Old enough for the movie");
            } else {
                System.out.println("GO AWAY.");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
