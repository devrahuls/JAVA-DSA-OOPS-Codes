package com.rahul;

public class Greeting {
    public static void main(String[] args) {
        String message = greeting();
        System.out.println(message);
    }

    static String greeting(){
        String msg = "How are you?";
        return msg;
    }
}
