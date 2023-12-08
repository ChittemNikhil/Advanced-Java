package threads.Executors;


import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

class Hello implements Callable<String>{
    String s ;
    Hello(String s){
        this.s =s;
    }


    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + ": s");
        return s;
    }
}
public class SimpleExecutor {

    public static void main(String[] args) {
        Hello h = new Hello("Hi");
        ExecutorService ex = Executors.newFixedThreadPool(5);
        ex.submit(h);
    }
}
