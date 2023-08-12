package Leetcode;

import java.util.ArrayList;


//Leetcode 17 - Letter combinations of a phone number.
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

public class PhonePad {
    public static void main(String[] args) {
//        pad("", "23");
        System.out.println(padList("" , ""));
    }

    static void pad(String p , String up){

        if (up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        int digit = up.charAt(0) - '0'; //This will basically convert '1' into 1

        for (int i = (digit - 1) * 3; i < digit * 3; i++){

            char ch = (char) ('a' + i);

            pad(p + ch, up.substring(1));
        }
    }


    static ArrayList<String> padList(String p , String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; //This will basically convert '1' into 1
        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++){

            char ch = (char) ('a' + i);

            ans.addAll(padList(p + ch, up.substring(1)));
        }
        return ans;
    }
}
