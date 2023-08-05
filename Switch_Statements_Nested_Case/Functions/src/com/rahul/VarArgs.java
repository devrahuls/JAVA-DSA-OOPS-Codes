package com.rahul;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {

//    In Java, a variable argument (vararg) is a feature that allows a method to accept an indefinite number of arguments of a specified type.
//    Varargs are often used when it is not known in advance how many arguments a method will need to accept.

    public static void main(String[] args) {
        fun(1, 57 , 86 , 6 , 907 , 64 , 75);
        multiple(2 , 3 , "Rahul", "Kunal", "Hihicdhsai");
    }

//    To declare a method with a vararg, you use the "..." syntax in the method's parameter list, followed by the type of the arguments. For example:
    static void fun(int ...integer){
        System.out.println(Arrays.toString(integer));
    }

    static void multiple(int a , int b, String ...c){

    }

//    static void multiple(int a , , String ...c, int b)  //Vararg parameter must be the last in the list.
}
