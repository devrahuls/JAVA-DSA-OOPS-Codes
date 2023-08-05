package com.rahul;

import java.util.Scanner;

public class Tempreature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the tempreature in celcius: ");
        int tempC = input.nextInt();

        double tempF = (tempC * 9/5) + 32;

        System.out.println("The tempreature in fahrenheit is: "+ tempF);

    }
}
