package java8.MethodReference;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MethodRefBasic {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=10; i<20; i++) {
            myList.add(i);
        }
//        myList.forEach(val -> System.out.println(val));
        myList.forEach(System.out::println);
    }

}
