import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Homework7 {
    public static void replaceLetter(String string, char oldLetter, char newLetter, Lock lock) {
        lock.lock();
        String newString = string.replace(oldLetter, newLetter);
        System.out.println(newString);
        lock.unlock();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();

        Lock lock = new ReentrantLock();

        Thread thread1 = new Thread(() -> replaceLetter(string, 'а', 'о', lock));
        Thread thread2 = new Thread(() -> replaceLetter(string, 'е', 'п', lock));
        thread1.start();
        thread2.start();
    }
}
