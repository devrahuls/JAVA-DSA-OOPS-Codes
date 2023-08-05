package com.rahul;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(checkPalindrome(null));
    }

    static boolean checkPalindrome(String str){
        if (str == null || str.length() == 0){
            return true;
        }

        str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
