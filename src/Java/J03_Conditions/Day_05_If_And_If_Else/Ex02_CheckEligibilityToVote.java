package Java.J03_Conditions.Day_05_If_And_If_Else;

import java.util.Scanner;

public class Ex02_CheckEligibilityToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
        sc.close();
    }
}
