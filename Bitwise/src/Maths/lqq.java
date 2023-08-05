package Maths;

import java.util.ArrayList;

public class lqq {

    public static void main(String[] args) {
//        String[] operations = {"X--", "X++", "X++"};
//
//        int x = 0;
//        for (int i = 0; i < operations.length; i++) {
//            if (operations[i] == "X++") {
//                x++;
//            }
//            if (operations[i] == "++X") {
//                x++;
//            }
//            if (operations[i] == "X--") {
//                x--;
//            }
//            if (operations[i] == "--X") {
//                x--;
//            }
//        }
//        System.out.println(x);





        int[] nums = {1, 2, 3, 1, 1, 3};

//        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length ; j++) {
                if( nums[i] == nums[j]){
                    System.out.println(i + ", " + j);
                }
            }
        }

    }
}