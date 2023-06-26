import java.util.Date;

public class MyThread extends Thread{
    @Override
    public void run(){
        Date currentDate = new Date();
        System.out.println("Time: " + currentDate);
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
