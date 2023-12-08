package java8.funcitonalinterface;



@FunctionalInterface
public interface Add {

    void sum();


    default  void welcome(){
        System.out.println("Hello");
    }

    default void bye(){
        System.out.println("bye");
    }

    static void hello(){
        System.out.println("hello");
    }
    static void takeCare(){
        System.out.println("Take care");
    }
}
