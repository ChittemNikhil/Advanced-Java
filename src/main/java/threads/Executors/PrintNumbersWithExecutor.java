package threads.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumbersWithExecutor {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 100; i++) {
            final int number = i;
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + ": " + number);
            });
        }

        executor.shutdown();
    }
}
