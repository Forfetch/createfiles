import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи длину строки");
        int input = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Напечтай произвольный текст");
        String text = scanner.nextLine();
        if (text.length()>input){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("readme.txt"))){
                    writer.write(text);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



//        File folder = new File("D:\\Новая папка (2)");
//        File[] files = folder.listFiles();
//        for (File file : files
//             ) {
//            System.out.println("Name " + file.getName());
//            System.out.println("Length " + file.length());
//            System.out.println("Is directory " + file.isDirectory());
//            System.out.println("Is file " + file.isFile());
//            System.out.println("**************************");
//        }

    }
}
