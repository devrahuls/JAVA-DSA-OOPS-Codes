package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> list : ans){
            System.out.print(list + ", ");
        }

        System.out.println();

        int[] arr1 = {1, 2, 2};
        List<List<Integer>> ans1 = subsetDuplicates(arr1);
        for(List<Integer> list1 : ans1){
            System.out.print(list1 + ", ");
        }

    }


    //Finding the subsequence or subset of array {1, 2, 3} without using Recursion.
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }


    //Finding the subsequence or subset of array {1, 2, 2} that contains duplicates and we have to remove duplicates, without using Recursion.
    static List<List<Integer>> subsetDuplicates(int[] arr){

        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for(int i = 0; i < arr.length; i++){
            start = 0;

            //If the current and previous element is same, then s = e + 1
            if (i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }

            end = outer.size() - 1;
            int n = outer.size();

            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }


}
