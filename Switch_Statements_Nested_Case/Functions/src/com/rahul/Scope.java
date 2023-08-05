package com.rahul;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a);
//        System.out.println(num);  We can't access those variables that is not inside this function.

//        BLOCK SCOPE
        {
//          int a = 30; //already initialised outside the block in the same method, hence can't initialise again.
            b = 40; // Reassigning the original ref variable to some other value.
            int c = 50;
            //Value initialise in this block will remain in the block.
        }
//        System.out.println(c); We can't access initialised variable ( c ) outside the block.


//        LOOP SCOPE
        for (int i = 0; i < 2; i++) {
            int d = 60;
            a = 70;
        }
//        d = 80;
        int d = 80;
    }


    // METHOD SCOPE
    static void random(){
        int num = 67;
        System.out.println(num);
//        System.out.println(a);    We can't access those variables that is not inside this function.
    }
}
