import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelCollectionExam {
    public static void main(String[] args) {
        int n = 10;

        List<Integer> collect = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            collect.add(i);
        }

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < n; i++) {
            int index = i;
            executor.execute(() -> {
                int value = collect.get(index);
                collect.set(index, value + 10);
            });
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            System.out.println("Elements after rise up: ");
            for ( int value : collect) {
                System.out.println(value);
            }
        }
    }
}
