import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoublySo {
    public static void main(String[] args) {
        System.out.println("Whatever is given, shall be returned twice-fold! -Gradernomity 24:7");
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String originalVal = bufferedReader.readLine();
            Integer intVal = Integer.parseInt(originalVal);
            Integer doubledNum = intVal * 2;

            System.out.println("Behold! Twice-foldedness... " + doubledNum);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
