package com.rahul;

public class StringComparison {
    public static void main(String[] args) {

        //Gonna save in Pool inside Heap m/m.
        String a = "Rahul";
        String b = "Rahul";

        System.out.println(a == b);//Gives true because a and b ref variable pointing to the same object.

        //Gonna save outside the pool but inside the heap m/m.
        String c = new String("Rahul");
        String d = new String("Rahul");

        System.out.println(a.equals(b)); //Gives true because, c and d have the same value. It might ok, if c and d doesn't
        // pointing to the same object, but it pointing to the same value. Hence, true.


    }
}
