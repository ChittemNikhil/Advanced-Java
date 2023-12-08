package java8.defaultmethod;

public class Restaurant {

    public static void main(String[] args) {

        DefInterface d1 = new Customer1();
        d1.welcome();
        d1.eat();
        d1.bye();
        System.out.println();
        DefInterface d2 = new Customer2();
        d2.welcome();
        d2.eat();
        d2.bye();


    }

}
