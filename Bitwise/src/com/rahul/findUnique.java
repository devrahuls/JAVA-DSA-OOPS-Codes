package com.rahul;

public class findUnique {
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 2, 3, 6, 4};
        System.out.println(findUniquee(arr));
    }

    static int findUniquee(int[] arr){
        int unique = 0;

        for (int n : arr){
            unique = unique ^ n; //unique XOR n
        }

        return unique;
    }
}
