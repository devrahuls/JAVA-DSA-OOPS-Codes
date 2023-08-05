package com.rahul;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Rahul Saw");
                break;
            case 2:
                System.out.println("Kunal Kushwaha");
                break;
            case 3:
                System.out.println("Employee no 3");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println(department+" department doesnt exist!");
                }
                break;
            default:
                System.out.println("Invalid Employee ID.");
        }


        //better way to write.
        switch (empID) {
            case 1 -> System.out.println("Rahul Saw");
            case 2 -> System.out.println("Kunal Kushwaha");
            case 3 -> {
                System.out.println("Employee no 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println(department + " department doesnt exist!");
                }
            }
            default -> System.out.println("Invalid Employee ID.");
        }
    }
}
