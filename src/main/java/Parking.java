import java.util.concurrent.Semaphore;

public class Parking {
    private Semaphore semaphore;
    private int spots;

    public Parking(int totalSpots) {
        semaphore = new Semaphore(totalSpots);
        this.spots = totalSpots;

    }

    public void parkCar() {
        try {
            semaphore.acquire();
            spots--;
            System.out.println("Машина припаркована. Свободных мест: " + spots);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void leaveParking() {
        semaphore.release();
        spots++;
        System.out.println("Машина покинула парковку. Свободных мест: " + spots);
    }
}
class Demo {
    public static void main(String[] args) {
        int spots = 5;
        int carArrive = 5;


        Parking parking = new Parking(spots);

        for (int i = 0; i < spots + carArrive; i++) {
            if (i < spots) {
                new Thread(parking::parkCar).start();
            } else {
                new Thread(parking::leaveParking).start();
            }
        }

    }
}





