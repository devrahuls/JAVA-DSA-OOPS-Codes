package com.rahul;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        System.out.println(find(arr , 4, 0));
        System.out.println(findIndex(arr , 4, 0));
        System.out.println(findIndexLast(arr , 4, arr.length - 1));
        System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 4, 0));
    }

    //Check if the element exist or not.
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

//    Find the index of the target number.
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }
    }

//    Find the index of the target number but from the last index of the array.
    static int findIndexLast(int[] arr,int target,int index){
        if (index < 0){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else{
            return findIndexLast(arr, target, index - 1);
        }
    }

    //Return the indices as Arraylist if target element exists more than one times
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){

        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    //Return the indices as Arraylist if target element exists more than one times. But without passing Arraylist as an argument to fn.
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }
        //this will contain answer for that function call only.
        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
