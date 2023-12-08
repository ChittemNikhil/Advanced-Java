package threads;


import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class MultithreadingDemo extends Thread{

    public void run(){
        int n = 10; //24 ms 1840ms 1-100000   310 ms
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }
    }
}

// Main Class
public class MultithreadingEx {
    public static void main(String[] args) throws InterruptedException {
         {
             LocalTime start = LocalTime.now();
             System.out.println(start);
             MultithreadingDemo mt = new MultithreadingDemo();
             mt.start();
             mt.join();
             LocalTime end = LocalTime.now();
             System.out.println(end);
             System.out.println("Time is : " + start.until(end, ChronoUnit.MILLIS) + " ms");



         }
    }
}
