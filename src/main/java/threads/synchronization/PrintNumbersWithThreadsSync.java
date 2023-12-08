package threads.synchronization;

public class PrintNumbersWithThreadsSync {
    public static void main(String[] args) {

        NumberPrinter np = new NumberPrinter(1,5);
        NumberPrinter np1 = new NumberPrinter(6,10);

        Thread thread1 = new Thread(np);
        Thread thread2 = new Thread(np1);

        thread1.start();
        thread2.start();

    }

    static class NumberPrinter implements Runnable {
        private final int start;
        private final int end;

        public NumberPrinter(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            synchronized (System.out) {
                for (int i = start; i <= end; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        }
    }
}

