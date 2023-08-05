package com.rahul;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList<>(10);
//
//        list.add(10); // Used to add the element in the array, which is 'list' reference variable.
//        list.add(20);
//        list.add(36);
//        list.add(74);
//        list.add(9374);
//        list.add(897);
//
//        System.out.println(list.contains(20)); // Used to check that given element is present or not in an Array.
//        System.out.println(list);
//
//        list.set(0, 99); // Used to set/update an element at a specific index no.
//        list.remove(2); // Used to remove a specific index no.
//
//        System.out.println(list);


        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));  // Pass list's index here, list[index] won't work here.
        }

    }
}
