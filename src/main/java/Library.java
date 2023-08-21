import java.util.concurrent.Semaphore;

public class Library {
    private static final int BOOKS_COUNT = 100;
    private static final int MAX_BOOKS_PER_PERSON = 3;
    private static final int MAX_PEOPLE_IN_READING_ROOM = 7;
    private static final int TOTAL_PEOPLE = 60;

    private static Semaphore booksSemaphore = new Semaphore(BOOKS_COUNT, true);
    private static Semaphore readingRoomSemaphore = new Semaphore(MAX_PEOPLE_IN_READING_ROOM, true);

    public static void main(String[] args) {
        for (int i = 0; i < TOTAL_PEOPLE; i++) {
            new Thread(() -> {
                try {
                    readingRoomSemaphore.acquire();

                    int booksToRead = (int) (Math.random() * MAX_BOOKS_PER_PERSON) + 1;

                    booksSemaphore.acquire(booksToRead);

                    System.out.println(Thread.currentThread().getName() + " is reading " + booksToRead + " book(s)");

                    booksSemaphore.release(booksToRead);

                    readingRoomSemaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}


