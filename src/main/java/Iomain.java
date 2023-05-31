import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Iomain {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String input;

        while (true){
            System.out.println("Enter the number: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit"))
                break;

            try {
                int num = Integer.parseInt(input);
                sum+= num;
            } catch (NumberFormatException e){
                System.out.println("Error, that "+ input + " not a number");
            }
        }
        System.out.println("Sum of all numbers is: "+sum);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine();
//        System.out.println("Testing message");
//        System.out.println(s);
    }
}
