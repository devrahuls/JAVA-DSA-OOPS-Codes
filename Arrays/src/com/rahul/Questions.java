package com.rahul;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        //Swap two indices of an Array.

        int[] arr0 = {2 ,42 ,46 ,568 ,234 ,6};

        swap(arr0, 1 , 3);

        System.out.println(Arrays.toString(arr0));



        // Find the maximum value in an Array
        int[] arr2 = {2 ,35 ,56 ,23 ,7, 4};

        System.out.println(max(arr2));


        // Find the maximum value in an Array in a Range.
        int[] arr4 = {2 ,35 ,79 ,23 ,7, 4};

        System.out.println(maxRange(arr4 , 1 , 3));


        //Reverse of an Array
        reverse(arr4);
    }

    static void swap( int arr1[] , int index1 , int index2){
        int temp = arr1[index1];
        arr1[index1] = arr1[index2];
        arr1[index2] = temp;
    }

    static int max(int[] arr3){
        int maxVal = arr3[0];

        for (int i = 1; i < arr3.length; i++) {

            if (arr3[i] > maxVal){
                maxVal = arr3[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr5, int start, int end){

        int maxVal =
                arr5[start];

        for (int i = start; i <= end; i++) {

            if (arr5[i] > maxVal){
                maxVal = arr5[i];
            }
        }
        return maxVal;
    }

    //Reverse of an Array
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            swap(arr , start, end);
            start ++;
            end --;
        }
        System.out.println(Arrays.toString(arr));
    }


}
