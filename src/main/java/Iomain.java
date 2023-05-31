import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Iomain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println("Testing message");
        System.out.println(s);
    }
}
