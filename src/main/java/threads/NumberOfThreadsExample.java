package threads;

// Java code for thread creation by extending
// the Thread class
class MtDemo extends Thread {
    public void run()
    {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running" );
            System.out.println("Thread Priority is : " + Thread.currentThread().getPriority());
            System.out.println("Thread name is : "  +Thread.currentThread().getName());
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

// Main Class
public class NumberOfThreadsExample {
    public static void main(String[] args)
    {
        int n = 2;
        for (int i = 0; i < n; i++) {
            MtDemo object = new MtDemo();
            object.start();
        }
    }
}
