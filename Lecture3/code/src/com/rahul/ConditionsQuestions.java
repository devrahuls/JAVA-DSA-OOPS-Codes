package com.rahul;

import java.util.Scanner;

public class ConditionsQuestions {
    public static void main(String[] args) {
        /*
        Take i/p a salary. If, salary is greater than 10,000, add 2,000 in bonus otherwise add 1,000 in bonus.
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your salary: ");
        int salary = input.nextInt();

//        if(salary >= 10000){
//            salary = salary + 2000;
//            System.out.println("Your salary with bonus is: " + salary);
//        }else {
//            salary = salary + 1000;
//            System.out.println("Your salary + bonus is:" + salary);
//        }

        //Nested if-else

        if (salary >= 10000){
            salary += 2000;
        } else if (salary >= 20000) {
            salary += 3000;
        }
        else {
            salary += 1000;
        }
        System.out.println("Your salary with bonus is: " + salary);
    }
}