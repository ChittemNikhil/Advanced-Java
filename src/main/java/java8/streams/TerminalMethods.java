package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalMethods {

    public static void main(String[] args){

//        List<Integer> li = Arrays.asList(1,7,8,91,99,98,100,44,62,73,4,8);

        List<Integer> li = Arrays.asList(1,2,3,4,5);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
//        Stream<Integer> s2 = li.stream().filter(i -> i%2 ==0);
//        s2.forEach(i -> evenNumbers.add(i));
        li.stream().filter(i -> i%2 ==0).forEach(evenNumbers::add);

        System.out.println(evenNumbers);

        Set<Integer> even = li.stream().filter(i -> i%2 ==0).collect(Collectors.toSet());
        System.out.println(even);


//1,2,3,4,5

//       int res = li.stream().filter(i -> i%2 ==0).reduce(0,(i,j) -> i+j);
        int res = li.stream().filter(i -> i%2 ==0).map(i-> i*100).reduce(0,Integer::max);
        System.out.println(res);



    }
}
