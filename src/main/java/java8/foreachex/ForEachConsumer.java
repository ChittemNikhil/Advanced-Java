package java8.foreachex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;

public class ForEachConsumer {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4,5);


//        list. forEach(i -> System.out.println(i));

//        Consumer<Integer> cn = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer i) {
//                System.out.println(i);
//            }
//        };

//        Consumer<Integer> cn = ;

//        list.forEach(i -> System.out.println(i));

        list.forEach(System.out::println);


    }
}
