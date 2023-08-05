package com.rahul;

import java.util.ArrayList;
import java.util.Arrays;

public class GreatestNumber {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int sum = 0;
        int eC = 3;
        ArrayList<Boolean> list= new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if(sum < candies[i]){
                sum = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i ++){
            if (sum <= candies[i] + eC ){
                list.add(true);
            }else {
                list.add(false);
            }
        }

        System.out.println(list);
    }
}
