package com.rahul;

public class StringBuilderrrr {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());

        builder.reverse();
        System.out.println(builder);

        //Play with all of these methods like, append, reverse, charAt, or whatever.
    }
}
