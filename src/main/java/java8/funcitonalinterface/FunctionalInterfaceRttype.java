package java8.funcitonalinterface;

@FunctionalInterface
interface SumReturnType{
    int add(int i, int j);
}
public class FunctionalInterfaceRttype {

    public static void main(String[] args) {
        SumReturnType localVar =
        (i, j) -> {
            int sumVar = i + j;
            return sumVar;
        };

//        int sum = localVar.add(10,20);
//        System.out.println("The sum is : " + sum);

        System.out.println(localVar.add(10,20));
    }


}
