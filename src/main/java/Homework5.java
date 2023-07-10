import java.util.Scanner;

public class Homework5 {
    private static int number;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = scanner.nextInt();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                number --;
                System.out.println("Thread 1: " + number);
            }
        });

        Thread thread2 = new Thread(() ->{
            for (int i = 0; i < 10; i++) {
                number--;
                System.out.println("Thread 2: " + number);
            }
        });
        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(() -> {
            synchronized (Homework5.class) {
                for (int i = 0; i < 10; i++) {
                    number--;
                    System.out.println("Thread 3: " + number );
                }
            }
        });
        Thread thread4 = new Thread(()->{
           synchronized (Homework5.class){
               for (int i = 0; i < 10; i++) {
                   number--;
                   System.out.println("Thread 4: " + number);
               }
           }
        });
        thread3.start();
        thread4.start();
    }
}
