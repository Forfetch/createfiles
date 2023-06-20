import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        String filename = "readme.txt";
        try (FileReader reader = new FileReader(filename)) {
            StringBuilder content = new StringBuilder();
            int character;
            int count = 0;
            while ((character = reader.read()) != -1) {
                char c = (char) character;
                content.append(c);
                if (Character.toLowerCase(c) == 'а') {
                    count++;
                }
            }
            String result = "Количество букв 'а': " + count;
            try (FileWriter writer = new FileWriter(filename)) {
                writer.write(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введи длину строки");
//        int input = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Напечтай произвольный текст");
//        String text = scanner.nextLine();
//        if (text.length()>input){
//            try (BufferedWriter writer = new BufferedWriter(new FileWriter("readme.txt"))){
//                    writer.write(text);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }



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
