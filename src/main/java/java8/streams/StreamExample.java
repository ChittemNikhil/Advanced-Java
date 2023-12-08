package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
//     List<String> msg =  Arrays.asList("Hi", "Hello", "welcome");
//
//        List<String> res = msg.stream().filter(x -> x.startsWith("H")).collect(Collectors.toList());
//        System.out.println(res);

        List<Integer> li = Arrays.asList(1,4,5,8,99,10,17);

        li.stream()
                .filter(x -> (x+3) % 2 == 0)
                .map(x -> x*x)
                .forEach(i -> System.out.println(i));

        int sum = li.stream().reduce(0, (i,j) -> i+ j);

        li.stream().mapToDouble(Integer::doubleValue).forEach(x -> System.out.println(x));


    }
}
