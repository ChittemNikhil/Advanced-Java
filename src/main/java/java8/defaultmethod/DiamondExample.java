package java8.defaultmethod;

interface Animal {
    default void eat() {
        System.out.println("Animal is eating");
    }
}

interface Mammal extends Animal {
    default void eat() {
        System.out.println("Mammal is eating");
    }
}

interface Bird extends Animal {
    default void eat() {
        System.out.println("Bird is eating");
    }
}


class Bat implements Mammal, Bird {
    @Override
    public void eat() {
        Mammal.super.eat();
        Bird.super.eat();
        System.out.println("Bat is eating");
    }
}

public class DiamondExample {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();
    }
}
