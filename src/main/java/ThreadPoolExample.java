import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            executor.execute(() -> {
                for (int j = 0; j < 10; j++) {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
            executor.shutdown();
    }
}


