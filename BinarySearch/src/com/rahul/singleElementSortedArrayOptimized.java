package com.rahul;

public class singleElementSortedArrayOptimized {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 8, 8};

        System.out.println(singleNonDuplicate1(arr));
    }

    static int singleNonDuplicate1(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end){

            int mid = start + (end - start)/2;

            if (mid % 2 ==0){
                if (nums[mid] == nums[mid + 1]){
                    start = mid + 1;
                }
                else{
                    end = mid;
                }
            }
            else{
                if (nums[mid] == nums[mid -1]){
                    start = mid + 1;
                }
                else {
                    end = mid;
                }
            }
        }
        if(start == end){
            return nums[start];
        }
        return -1;
    }

}
