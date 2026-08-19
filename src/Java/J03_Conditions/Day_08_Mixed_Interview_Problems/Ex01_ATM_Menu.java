package Java.J03_Conditions.Day_08_Mixed_Interview_Problems;

import java.util.Scanner;

public class Ex01_ATM_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your menu:");
        int menu = sc.nextInt();
        switch (menu){
            case 1:
                System.out.println("Balance Inquiry");
                break;
            case 2:
                System.out.println("Deposit");
                break;
            case 3:
                System.out.println("Withdraw");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println("Please enter your balance:");
        int balance = sc.nextInt();
        System.out.println("Please enter withdrawal amount:");
        int amount = sc.nextInt();
        int minimumBalance = 1000;
        int remainingBalance = balance - amount;
        if (balance < amount){
            System.out.println("Insufficient Balance");
        } else if (remainingBalance < minimumBalance) {
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance :"+remainingBalance);
        }
        else {
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance :"+remainingBalance);
        }
        sc.close();
    }
}
