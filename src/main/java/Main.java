import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("readme.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = bufferedReader.readLine();
        while ((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }

//        if (!(Files.exists(Path.of("readme.txt")))){
//            Files.createFile(Path.of("readme.txt"));
//        }
//        String str = "I love Java";
//        File file = new File("readme.txt");
//        FileWriter fileWriter = new FileWriter(file);
//        fileWriter.write(str);
//        fileWriter.close();
//       if (!(Files.exists(Path.of("readme.txt")))){
//           Files.createFile(Path.of("readme.txt"));
//       } else {
//           Files.delete(Path.of("readme.txt"));
//       }

    }
}
