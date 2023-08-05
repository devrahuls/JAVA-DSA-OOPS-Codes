package com.rahul;

/*
https://www.youtube.com/watch?v=fzip9Aml6og&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=26&t=1988s
at 1:25:00
*/
public class Magic {
    public static void main(String[] args) {

        int n = 5; //Number of iterations that we want
        int base = 5; //Magic number from that we wanna multiply the binary iterations.
        int ans = 0;

        while (n > 0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5; //base * that magic number
        }

        System.out.println(ans);

    }
}
