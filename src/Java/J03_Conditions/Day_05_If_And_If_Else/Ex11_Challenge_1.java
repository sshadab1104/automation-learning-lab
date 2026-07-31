package Java.J03_Conditions.Day_05_If_And_If_Else;

import java.util.Scanner;

public class Ex11_Challenge_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter account balance:");
        int balance = sc.nextInt();
        System.out.println("Please enter withdrawal amount:");
        int amount = sc.nextInt();
        int minimumBalance = 1000;
        int remainingBalance = balance - amount;
//        if (balance >= amount && remainingBalance < minimumBalance){
//            System.out.println("Withdrawal Denied");
//            System.out.println("Minimum balance of ₹1000 must be maintained.");
//        } else if (balance >= amount) {
//            System.out.println("Withdrawal Successful");
//            System.out.println("Remaining Balance :"+remainingBalance);
//        } else {
//            System.out.println("Insufficient Balance");
//        }
        if (balance < amount){
            System.out.println("Insufficient Balance");
        }
        else if (remainingBalance < minimumBalance) {
            System.out.println("Withdrawal Denied");
            System.out.println("Minimum balance of ₹1000 must be maintained.");
        }
        else {
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance :"+remainingBalance);
        }
        sc.close();
    }
}
