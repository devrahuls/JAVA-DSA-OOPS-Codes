package com.rahul;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class QTwoStacks {

    public static int twoStacks(int x, int[] a, int[] b){

        return twoStacks(x, a, b, 0, 0) - 1;
    }

    public static int twoStacks(int x, int[] a, int[] b, int sum, int count){
        if (sum > x){
            return count;
        }
        if (a.length == 0 || b.length == 0){
            return count;
        }

        int ans1 = twoStacks(x, Arrays.copyOfRange(a,1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Number of test cases you want.
        System.out.print("Enter the number of test cases you want");
        int t = sc.nextInt();


        for (int i = 0; i < t; i++) {

            //Declare the size of the array.
            System.out.println("Declare the size of the Stack 1 you want");
            int n = sc.nextInt();
            System.out.println("Declare the size of the Stack 2 you want");
            int m = sc.nextInt();
            //Declare the maxSum.
            System.out.println("Enter the maxSum");
            int x = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            System.out.println("Enter the elements for Stack 1");
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            System.out.println("Enter the elements for Stack 2");
            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }

            System.out.println("The max count is: " + twoStacks(x, a, b));
        }

    }
}
