package java8.foreachex;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;

public class ForEachExample {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();
        for(int i=10; i<20; i++) {
            myList.add(i);
        }

//        traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator Value::"+i);
        }


        myList.forEach(val -> System.out.println(val));

        myList.forEach(i -> {
            int sum = i + i;
            System.out.println(sum);
        });
    }

}

