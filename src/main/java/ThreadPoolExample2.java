import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample2 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            executor.execute(new Task("Thread " + (i % 10 + 1), i));
        }

        executor.shutdown();
    }

    static class Task implements Runnable {
        private String name;
        private int i;

        public Task(String name, int i) {
            this.name = name;
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println(name + " " + i);
            try {
                Thread.sleep(1000); // имитация длительной работы
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
