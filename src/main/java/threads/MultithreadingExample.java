package threads;


import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class Multithreading extends Thread{

    public void run(){
        int n = 7890; //24 ms 1840ms 1-100000   310 ms
        for (int i = 7870; i < n; i++){
            System.out.println("This is executing from thread " + Thread.currentThread().getId());
        }
    }
}

// Main Class
public class MultithreadingExample {
    public static void main(String[] args) throws InterruptedException {
         {
             LocalTime start = LocalTime.now();
             System.out.println(start);
             Multithreading mt = new Multithreading();
             mt.start();
             mt.join();
             LocalTime end = LocalTime.now();
             System.out.println(end);
             System.out.println("Time is : " + start.until(end, ChronoUnit.MILLIS) + " ms");

         }
    }
}
