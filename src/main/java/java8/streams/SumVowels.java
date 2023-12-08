package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumVowels {
    public static void main(String[] args) {


        String ip = "HellOworld";
        StringBuilder sb = new StringBuilder();

        int asciiValueDiff = 'a' - 'A';
        System.out.println(asciiValueDiff);

        for (int i = 0; i < ip.length(); i++) {
            if (i % 2 == 1) {
                int asciiVal = (int) ip.charAt(i);
                char temp = (char) (asciiVal - asciiValueDiff);
                sb.append(temp);
            }
        }
        System.out.println(sb);



        String[] str = ip.split("");
        ArrayList<String> li = new ArrayList<>(Arrays.asList(str));
        System.out.println(li);

       IntStream.range(0,li.size()).filter(i -> i%2 != 0).mapToObj(li::get).map(String::toUpperCase)
               .forEach(System.out::println);


    }
}
