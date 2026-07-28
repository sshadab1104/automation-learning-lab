package Java.J03_Conditions.Day_05_If_And_If_Else;

import java.util.Scanner;

public class Ex10_ATM_WithdrawalEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter account balance:");
        int balance = sc.nextInt();
        System.out.println("Please enter withdrawal amount:");
        int amount = sc.nextInt();
        if (balance >= amount){
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance : XXXX");
        }
        else {
            System.out.println("Insufficient Balance");
        }
        sc.close();
    }
}
