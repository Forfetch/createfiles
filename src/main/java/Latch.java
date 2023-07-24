import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Latch {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
        int count = 5;
        CountDownLatch latch = new CountDownLatch(1);
        int[] numbers = new int[count];

        new Thread(() -> {
            System.out.println("Please enter " + count + " different numbers:");
            for (int i = 0; i < count; i++) {
                numbers[i] = scanner.nextInt();
            }
            latch.countDown();
        }).start();

        latch.await();
        System.out.print("Numbers entered: ");
        for (int number : numbers) {
            System.out.print(number / 2 + ", ");
        }
    }
}
