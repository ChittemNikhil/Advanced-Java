package threads.Executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SynchronousNumbersWithCallableAndExecutor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();


        List<Future<String>> futures = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            final int number = i;
            Future<String> future = executor.submit(new NumberPrinter(number));
            futures.add(future);
        }

        for (Future<String> future : futures) {
            try {
                String result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the ExecutorService to release resources
        executor.shutdown();
    }

    static class NumberPrinter implements Callable<String> {
        private final int number;

        public NumberPrinter(int number) {
            this.number = number;
        }

        @Override
        public String call() {

            return Thread.currentThread().getName() + ": " + number;
        }
    }
}
