package threads;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


class SimpleThreadDemo{
    public void run(){
        int n = 100000;
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }
    }
}

// Main Class
public class SimpleThreadEx {
    public static void main(String[] args)
    {
        {
            LocalTime start = LocalTime.now();
            System.out.println(start);
            SimpleThreadDemo object = new SimpleThreadDemo();
            object.run();
            LocalTime end = LocalTime.now();
            System.out.println(end);
            System.out.println("Time is : " + start.until(end, ChronoUnit.MILLIS) + " ms");

        }
    }
}
