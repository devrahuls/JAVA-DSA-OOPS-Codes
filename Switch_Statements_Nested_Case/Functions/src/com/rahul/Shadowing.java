package com.rahul;

public class Shadowing {
    static int x = 90; //This will be shadowed at the line no 9

    public static void main(String[] args) {
        System.out.println(x);
        int x; //The class's variable at line no 4 is shadowed by this.
//        System.out.println(x);   // Shadowing will begin when value is being initialised.
        x = 40;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
