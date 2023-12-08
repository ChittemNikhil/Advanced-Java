package java8.MethodReference;

import java.util.Arrays;
import java.util.List;

interface Sum{
    static void sumByHundred(int i){
        System.out.println(i + 100);
    }

}
class StaticMethodClass{
    static void addByTen(int i){
        System.out.println(i + 10);
    }
}

public class StaticMethodRef {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7);

//        StaticMethodClass.addByTen(10);
//
//        Sum.sumByHundred(20);

        //1st way
        for(int i = 0; i < list.size() ; i++){
         StaticMethodClass.addByTen(list.get(i));
        }

        System.out.println("-----------");

        //2nd way using lambda exp
        list.forEach(val ->  StaticMethodClass.addByTen(val));

        System.out.println("-----------");
        //3rd way using method ref
        list.forEach(StaticMethodClass::addByTen);

        System.out.println("-----------");
        //Static method reference of an interface
        list.forEach(Sum::sumByHundred);



    }
}
