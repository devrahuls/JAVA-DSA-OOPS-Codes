package com.rahul;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        number(1);
    }
    static void number(int n){
//        Base Condition
        if (n == 5) {
            System.out.println(n);
            return;
        }

        System.out.println(n);

        //Recursive call
        //If you are calling a function again and again, you can treat it as a separate call in the stack.
        number(n + 1);
    }
}
