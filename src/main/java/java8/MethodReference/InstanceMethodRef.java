package java8.MethodReference;

import java.util.Arrays;
import java.util.List;

class InstanceMethodClass {
    void mulByTen(int i) {
        System.out.println(i * 10);
    }
}

public class InstanceMethodRef {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8);

        InstanceMethodClass im = new InstanceMethodClass();


        list.forEach(val -> im.mulByTen(val));

        System.out.println("------");

        list.forEach(im::mulByTen);




    }

}
