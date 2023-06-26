public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println("Increment " + i);
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        Thread devideThread = new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 5; i++) {
                    int number = (int) ((Math.random()+1)*50);
                    System.out.println("Devide by 2 : " + number/2);
                }
            }
        };
        devideThread.start();
    }
}
