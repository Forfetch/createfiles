import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        File folder = new File("D:\\Новая папка (2)");
        File[] files = folder.listFiles();
        for (File file : files
             ) {
            System.out.println("Name " + file.getName());
            System.out.println("Length " + file.length());
            System.out.println("Is directory " + file.isDirectory());
            System.out.println("Is file " + file.isFile());
            System.out.println("**************************");
        }

    }
}
