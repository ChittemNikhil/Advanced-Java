package java8.funcitonalinterface;



public class LambdaExpEx {

    public static void main(String[] args) {
        Add i = () -> {
            System.out.println("sum of 2 numbers is :" + (10 + 20));
        };

         i.sum();
    }




}
