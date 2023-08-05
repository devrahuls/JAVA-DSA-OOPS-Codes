package com.rahul;


// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastElement {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
//        Check for the first occurence of target first.

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

return ans;

    }

    int search(int[] nums, int target, boolean isElementFound) {

        int ans = -1;
;
        //        Check for the first occurence of target first.
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
//            int mid = (start + end) / 2; // The value of mid may exceed the range of int, hence cause error.
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Potential answer is being found.
                ans = mid;
                if (isElementFound) {
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
