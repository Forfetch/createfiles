import java.io.*;

public class Lessons {
  public static void main(String[] args) {

    String s1 = "Hello world";
    String s2 = "Helllo world ";
    try (PrintWriter printWriter = new PrintWriter("notes.txt")) {
      printWriter.println(s1);
      int i = 2;
      printWriter.printf("Square number %d is %d %n", i, i*i);
      printWriter.write(s2);
      printWriter.print("The end");
      System.out.println("Mission complete");
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }

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

