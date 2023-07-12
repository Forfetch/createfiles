public class Homework6 {
    private static int i = 0;

    public static void main(String[] args) {

        Thread increment = new Thread(() -> {
            synchronized (Homework6.class) {
                i += 10;
                System.out.println("Thread 1: " + i);
                Homework6.class.notify();
            }
        });

        Thread decrement = new Thread(() -> {
            synchronized (Homework6.class) {
                try {
                    Homework6.class.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i -= 5;
                System.out.println("Thread 2: " + i);
            }
        });

        decrement.start();
        increment.start();
    }
}


