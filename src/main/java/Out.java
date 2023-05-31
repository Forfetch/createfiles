import java.util.Scanner;

public class Out {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true){
            System.out.println("Type something: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit"))
                break;

            System.out.println("Input length is: " + input.length());
            System.out.println(String.format("Input length: %d", input.length()));
            System.out.printf("Input lenght is: %d\n", input.length());
        }
        scanner.close();
    }
}
