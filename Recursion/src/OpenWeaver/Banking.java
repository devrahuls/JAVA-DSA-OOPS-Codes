package OpenWeaver;

import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("SL Devcode", "SL00001");
        obj.showMenu();

    }

}
class  BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;



    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;

    }

    void Deposit(int amount) {
        if(amount !=0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount) {
        if(amount !=0) {
            if (amount <= balance) { // Check if withdrawal amount is valid
                System.out.println("Current Balance: " + balance);
                balance = balance - amount;
                previousTransaction = -amount;
                System.out.println("Amount withdrawn from the account = " + amount);
                System.out.println("Remaining balance = " + balance);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        }
    }
    void getPreviousTransaction() {
        if(previousTransaction > 0) {
            System.out.println("Deposited:" + previousTransaction);
        }
        else if(previousTransaction < 0) {
            System.out.println("withdrawn:" +Math.abs(previousTransaction));
        }
        else {
            System.out.println("No Transaction occured");
        }
    }
    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome" +customerName);
        System.out.println("Welcome" +customerId);
        System.out.println("/n");

        System.out.println("A : Check Account Balance");
        System.out.println("B : Deposit Money");
        System.out.println("C : Withdraw Money");
        System.out.println("D : Previous Transaction Details");
        System.out.println("E : Calculate Fixed Deposit Interest");
        System.out.println("F : Calculate Saving Account Interest");
        System.out.println("G : Calculate Compound Interest");
        System.out.println("Q : Exit");

        do {
            System.out.println("************************************");
            System.out.println("Enter your Option");
            System.out.println("************************************");

            option = scanner.next().charAt(0);


            switch(option) {
                case 'A':
                    System.out.println("------------------------------------");
                    System.out.println("Account Balance= " +balance);
                    System.out.println("------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("------------------------------------");
                    System.out.println("Enter an amount to deposit");
                    System.out.println("------------------------------------");
                    int amount = scanner.nextInt();
                    Deposit(amount);
                    System.out.println("Amount deposited in the account = "+amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("------------------------------------");
                    System.out.println("Enter an amount to withdraw");
                    System.out.println("------------------------------------");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
//                    System.out.println("Amount withdrawn from the account = "+amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("------------------------------------");
                    System.out.println("Your previous transaction status is: \n ");
                    getPreviousTransaction();
                    System.out.println("--------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    double rate = 7.1;

                    System.out.println("Enter the principal amount:");
                    double principal = scanner.nextDouble();

                    System.out.println("Enter the time period(in years):");
                    double time=scanner.nextDouble();


                    //fixed deposit

                    double fdInterest = (principal*rate*time)/100;
                    System.out.println("Interest for fixed Deposit:" +fdInterest);
                    break;

                case 'F':
                    double interest = 5;

                    System.out.println("Enter the principal amount:");
                    double principalAmount = scanner.nextDouble();

                    System.out.println("Enter the time period(in years):");
                    double timePeriod=scanner.nextDouble();

                    double saInterest = principalAmount*Math.pow((1+interest/100), timePeriod) - principalAmount;
                    System.out.println("Interest for Savings Account:" + saInterest);
                    break;

                case 'G':
                    System.out.println("------------------------------------");
                    System.out.println("Calculate Compound Interest:");
                    System.out.println("------------------------------------");
                    calculateCompoundInterest();
                    System.out.println("\n");
                    break;


                case 'Q':
                    System.out.println("Preparing to exit...");
                    break;

                default:
                    System.out.println("Invalid option!! please enter one of the valid options: A,B,C,D,E,F,G,Q...");
                    break;
            }
        }
        while(option != 'Q');
        System.out.println("Thank you for using our services......!!");

    }


    //Compound Interest
    void calculateCompoundInterest() {

        Scanner scanner = new Scanner(System.in);

        double rate = 5.5; // Compound interest rate

        System.out.println("Enter the principal amount:");
        double principalAmount = scanner.nextDouble();

        System.out.println("Enter the time period (in years):");
        double timePeriod = scanner.nextDouble();

        double compoundInterest = principalAmount * Math.pow((1 + rate / 100), timePeriod) - principalAmount;
        System.out.println("Compound Interest: " + compoundInterest);
    }


}
