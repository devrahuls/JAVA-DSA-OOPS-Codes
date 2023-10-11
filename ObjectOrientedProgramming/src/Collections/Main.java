package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list2.add(45);
        list2.add(67);
        list2.add(12);
        list2.add(13);

        System.out.println(list2);


        List<Integer> vector = new Vector<>();
        vector.add(12);
        vector.add(123);
        vector.add(43);
        vector.add(46);

        System.out.println(vector);


    }
}
