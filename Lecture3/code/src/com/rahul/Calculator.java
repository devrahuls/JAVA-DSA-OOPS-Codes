package com.rahul;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Take input from the user till the user does not press 'x' or 'X'.

        float ans = 0;

        while (true){

            System.out.print("Enter the operator: ");
            char ch = in.next().trim().charAt(0);

            if( ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                //input two numbers

                System.out.print("Enter the two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if( ch == '+'){
                    ans = num1 + num2;
                }
                if( ch == '-'){
                    ans = num1 - num2;
                }
                if( ch == '*'){
                    ans = num1 * num2;
                }
                if( ch == '/'){
                    if ( num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if( ch == '%'){
                    ans = num1 % num2;
                }
            }
            else if ( ch == 'x' || ch == 'X') {
                break;
            }
            else {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
        }
    }
}
