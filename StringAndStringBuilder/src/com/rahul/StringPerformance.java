package com.rahul;

public class StringPerformance {
    public static void main(String[] args) {
        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
        }

        System.out.println(series); //This will gives us whole english alphabets.

        //It perform on O(n^2). Because of Iterations. So, to reducing the Time Complexity we have String Builder class.
    }
}
