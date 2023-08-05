package com.rahul;

public class LetsPlayWithParameters {
    public static void main(String[] args) {
        String name = "Rahul";
        greet(name);
        System.out.println(name); // It will display Rahul instead of Kunal.
    }

    static void greet(String naam){
        naam = "Kunal";
    }
}