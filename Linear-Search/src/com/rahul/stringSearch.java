package com.rahul;

public class stringSearch {
    public static void main(String[] args) {

        String strr = "Rahul";
        char find = 'u';
        boolean ans = linearSearch(strr , find);
        System.out.println(ans);

    }
    static boolean linearSearch(String str, char target ){
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }

        return false;
    }
}
