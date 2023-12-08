package threads;


import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class MultiThreadingRunnableDemo implements Runnable {
    public void run(){
        int n = 10;
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }
    }
}
public class MultiThreadingRunnable {

    public static void main(String[] args) throws InterruptedException{


//        Thread thread = new Thread(() -> {
//            int n = 10;
//            for (int i = 0; i < n; i++){
//                System.out.println(i);
//            }
//        });
//        thread.start();
//
//
//        Thread thread2 = new Thread(() -> {
//            int n = 20;
//            for (int i = 0; i < n; i++){
//                System.out.println(i);
//            }
//        });
        LocalTime start = LocalTime.now();
        System.out.println(start);
       MultiThreadingRunnableDemo mt = new MultiThreadingRunnableDemo();
       Thread t = new Thread(mt);
       t.start();
        LocalTime end = LocalTime.now();
        System.out.println(end);
        System.out.println("Time is : " + start.until(end, ChronoUnit.MILLIS) + " ms");




    }
}
