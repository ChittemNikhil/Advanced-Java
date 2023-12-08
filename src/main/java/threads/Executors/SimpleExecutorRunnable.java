package threads.Executors;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class PrintNumbers implements Runnable{

    @Override
    public void run() {

        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }

    }
}

public class SimpleExecutorRunnable {


    public static void main(String[] args) {
        ExecutorService ex = Executors.newSingleThreadExecutor();

        ex.submit(new PrintNumbers());
    }
}
