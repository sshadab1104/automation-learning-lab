package Java.J03_Conditions.Assessment_01;

import java.util.Scanner;

public class Que02_ATM_Withdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your balance amount:");
        int balance = sc.nextInt();
        System.out.println("Please enter your withdrawal amount:");
        int withdrawalAmount = sc.nextInt();
        int remainingBalance = balance - withdrawalAmount;
        int minimumBalance = 1000;
        if (balance < withdrawalAmount){
            System.out.println("Insufficient balance");
        } else if (remainingBalance < minimumBalance) {
            System.out.println("Withdrawal Denied");
            System.out.println("Minimum balance of ₹1000 must be maintained.");
        } else {
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance is: "+remainingBalance);
        }
    }
}
