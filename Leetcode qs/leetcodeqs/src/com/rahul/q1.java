package com.rahul;

import java.util.*;

//Leetcode 119
public class q1 {
    public static void main(String[] args) {

//        System.out.println("sifuec");
        System.out.println(index(2));
    }

    static List<Integer> index(int getIndexNumber){

//        Dynamic Array
        ArrayList<Integer> arr = new ArrayList<>();


        if (getIndexNumber == 0){
            arr.add(1);
        }
        if (getIndexNumber == 1){
            Collections.addAll(arr, 1,1);
        }

        if (getIndexNumber > 1){
            arr.add(0, 1);
            arr.add(arr.toArray().length, 1);

        }

        return arr;
    }
}
