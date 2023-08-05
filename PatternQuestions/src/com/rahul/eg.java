package com.rahul;

import java.util.Arrays;

public class eg {
    public static void main(String[] args) {
        String s1 = "Rahul";
        String s2 = "Saw";
        String s3 = "@gmail.com";
        String fullName = s1 + "." +s2;
        String oneMore = fullName + s3;
        System.out.println(oneMore);

        int len = oneMore.length();
        int part = len/3;

        String part1 = oneMore.substring(0, 5);
        String part2 = oneMore.substring(6, 9);
        String part3 = oneMore.substring(9, 19);

        String[] parts = {part1, part2, part3};

        System.out.println(Arrays.toString(parts));
    }
}
