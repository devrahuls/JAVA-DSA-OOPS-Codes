package Leetcode;

import java.util.Arrays;

//Leetcode 344 Reverse String. https://leetcode.com/problems/reverse-string/
public class reverseStr {
    public static void main(String[] args) {
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        revStr(ch, 0, ch.length - 1);
        System.out.println(Arrays.toString(ch));
    }

    static void revStr(char[] ch, int start, int end){

        if (start > end){
            return;
        }

        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;

        revStr(ch, start + 1, end - 1);

    }
}
