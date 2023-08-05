package com.rahul;

public class MethodOverloading {
    public static void main(String[] args) {
        fun(90);
        fun("Rahul");
        fun(80 , 70);
//        demo(); //This will throw error cause of the Ambiguity. It happens when the Java compiler is unable to determine which method or
                  // constructor is to invoke based on the arguments passed to it.
        test(10 , 20); //It returns test(int p, int q)
        test(30); //It returns test(int ...v)
    }
    static int fun(int a){
        System.out.println(a);
        return a;
    }
    static void fun(String name){
        System.out.println(name);
    }
    static int fun(int a , int b){
        System.out.println(a + " " + b);
        return a + b;
    }
//    static void fun(int a) //This will throw error says "fun(int) is already defined."

    static void demo(int a){}

    static void demo(String name){}

    static void test(int a , int b){
        System.out.println("First");
    }
    static void test(int ...v){
        System.out.println("Second");
    }
}
