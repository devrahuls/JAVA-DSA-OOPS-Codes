package com.rahul;

import java.util.Arrays;

//https://leetcode.com/problems/richest-customer-wealth/
public class richestCustomer {
    public static void main(String[] args) {
        int[][] array = {
                {1 ,23 ,32},
                {21 ,34 ,35},
                {3, 32 ,47}
        };

        int ans = maximumWealth(array);
        System.out.println(ans);

    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;

//        person == row
//        account == col

        for (int person = 0; person < accounts.length; person++) {

            int rowsum = 0;

            for (int account = 0; account < accounts[person].length; account++) {
                rowsum = rowsum + accounts[person][account];
            }

            if(rowsum > max){
                max = rowsum;
            }

        }
        return max;
    }

}
