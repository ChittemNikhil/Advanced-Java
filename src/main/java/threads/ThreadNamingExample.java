package threads;

import java.util.Scanner;

class MtNameDemo extends Thread {

    MtNameDemo(String threadName){
        super(threadName);
    }
    MtNameDemo(){

    }
    public void run()
    {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running" );
            System.out.println("Thread name is : " + Thread.currentThread().getName());
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

// Main Class
public class ThreadNamingExample {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = "";


        int n = 10;
//        for (int i = 0; i < n; i++) {
//            MtNameDemo object = new MtNameDemo();
//            object.start();
//        }

//        MtNameDemo mt = new MtNameDemo("HelloWorld");
//        mt.start();
//
//        MtNameDemo mt2 = new MtNameDemo();
//        System.out.println("Before Name change : " + mt2.getName());
//        mt2.setName("HiBye");
//        System.out.println("After name change : " + mt2.getName());
//        mt2.start();
//
//        System.out.println("Enter user defined id of the thread :");
//        id = sc.next();
        System.out.println("Enter user defined name of the thread");
        name = sc.next();

        MtNameDemo mt = new MtNameDemo(name);
        System.out.println("My thread name is : " + mt.getName());


    }
}

