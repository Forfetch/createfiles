import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
       if (!(Files.exists(Path.of("readme.txt")))){
           Files.createFile(Path.of("readme.txt"));
       } else {
           Files.delete(Path.of("readme.txt"));
       }

    }
}
