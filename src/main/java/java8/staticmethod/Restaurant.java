package java8.staticmethod;

interface Hospitality {

    static void welcome(){ // static method
        System.out.println("Welcome");
    }

    void eat(); // abstract method

    default void bye() {
        System.out.println("bye");
    }
}

public class Restaurant implements Hospitality {


    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void bye() {
        System.out.println("Bye from local");
    }

    public static void main(String[] args) {

        Hospitality.welcome();


        Restaurant myObject = new Restaurant();
        myObject.eat();
        myObject.bye();


    }

}

