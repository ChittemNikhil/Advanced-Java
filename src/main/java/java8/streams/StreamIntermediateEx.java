package java8.streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamIntermediateEx {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(100,51,2,4,6,7,9,88,77);


        // 1) Filter even numbers from the given list
        // 2) after filtering multiply the value by 10
        // 3) Arrange the above result in the sorted order.
        // (My original list shouldn't be changed)

        /* ArrayList<Integer> modifiedList = new ArrayList<>();

        li.forEach(i -> {
            if(i%2 == 0)
                modifiedList.add(i);
        });

        System.out.println(modifiedList);

        ArrayList<Integer> multipliedList = new ArrayList<>();

        modifiedList.forEach(i -> multipliedList.add(i*10));
        System.out.println(multipliedList);*/



//        Stream<Integer> s = li.stream();
//
//        s.forEach(i-> System.out.println(i));
//        s.forEach(System.out::println);

//        Stream<Integer> s1 = li.stream().filter(i -> i%2 ==0);
//        Stream<Integer> s2 = s1.map(i -> i * 10);
//        Stream<Integer> s3 = s2.sorted();
//        s3.forEach(System.out::println);

        Stream<Integer> s = li.stream().filter(i -> i%2 ==0)
                                        .map(i -> i * 10)
                                        .sorted();
        s.forEach(System.out::println);

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        Stream<Integer> s2 = li.stream().filter(i -> i%2 ==0);

        s2.forEach(i -> evenNumbers.add(i));
        System.out.println(evenNumbers);

//        evenNumbers.stream().map();


















    }
}
