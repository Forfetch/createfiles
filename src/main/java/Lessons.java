import java.io.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Lessons {

  public static void main(String[] args) {

    CyclicBarrier cyclicBarrier = new CyclicBarrier(3,new BarAction());
    System.out.println("Threads start");

    new MyThread1(cyclicBarrier, "A");
    new MyThread1(cyclicBarrier, "B");
    new MyThread1(cyclicBarrier, "C");



//    String s1 = "Hello world";
//    String s2 = "Helllo world ";
//    try (PrintWriter printWriter = new PrintWriter("notes.txt")) {
//      printWriter.println(s1);
//      int i = 2;
//      printWriter.printf("Square number %d is %d %n", i, i*i);
//      printWriter.write(s2);
//      printWriter.print("The end");
//      System.out.println("Mission complete");
//    } catch (FileNotFoundException e) {
//      System.out.println(e.getMessage());
//    }
//
//    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("readme.txt"))){
//      String text = "Hello world";
//      bufferedWriter.write(text);
//      bufferedWriter.newLine();
//      bufferedWriter.write(text);
//    } catch (IOException e) {
//      System.out.println(e.getMessage());
//    }

    // public static String readLine(String path) throws IOException {
//   // try с ресурсами для закрытия ресурса
//      try (BufferedReader br = new BufferedReader(new FileReader(path))){
//          return br.readLine();
//      }
//      // без использования try с ресурсами
//      BufferedReader br = new BufferedReader(new FileReader(path));
//      try {
//          return br.readLine();
//      } finally {
//          if (br != null) {
//              br.close();
//          }
//      }
  }
}

class BarAction implements Runnable {

  @Override
  public void run() {
    System.out.println("Barrier stop");
  }
}
class MyThread1 implements Runnable{
  CyclicBarrier cbar;
  String name;
   MyThread1(CyclicBarrier c, String n) {
    cbar = c;
    name = n;
    new Thread(this).start();
  }

  @Override
  public void run() {
    System.out.println(name);

    try {
      cbar.await();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    } catch (BrokenBarrierException e) {
      throw new RuntimeException(e);
    }
  }
}