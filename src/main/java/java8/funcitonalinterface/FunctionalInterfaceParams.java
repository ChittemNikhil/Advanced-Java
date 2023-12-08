package java8.funcitonalinterface;

@FunctionalInterface
interface SumParams{
    void add(int i, int j);
}
public class FunctionalInterfaceParams {

    public static void main(String[] args) {

        SumParams localVar =  (int i , int j) -> {
            int sum = i + j;
            System.out.println("Sum from anonymous func is : " + sum);
        };

        localVar.add(10,20);
    }
}
