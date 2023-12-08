package java8.MethodReference;


class Welcome {
    Welcome(String welcomeMsg){
        System.out.println(welcomeMsg);
    }


//    @Override
//    public Welcome welcomeGreet(String msg) {
//        return null;
//    }
}

interface Greeting{
    Welcome welcomeGreet(String msg);
}
public class ConstructorMethodRef {

    public static void main(String[] args) {
        Greeting greeting = Welcome::new;
        Welcome w = greeting.welcomeGreet("Hello");


//        Greeting greeting = new Welcome("Hi");





    }

}
