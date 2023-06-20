import java.util.Scanner;

public class Formtext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        System.out.println("Please enter your surname");
        String surname = scanner.nextLine();

        System.out.println("Please enter your phone number");
        String phone = scanner.nextLine();

        System.out.printf("User name is %s %s, %nPhone number is %s", name, surname, phone);
    }
}
