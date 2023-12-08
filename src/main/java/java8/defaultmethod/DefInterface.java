package java8.defaultmethod;

public interface DefInterface {

    default void welcome(){
        System.out.println("Welcome");
    }

    void eat();

    default void bye(){
        System.out.println("Bye");
    }

}
