package Java.J03_Conditions.Day_05_If_And_If_Else;

import java.util.Scanner;

public class Ex05_CheckEligibleForSeniorCitizenDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        if(age >= 60){
            System.out.println("You are eligible for Senior Citizen Discount");
        }
        else {
            System.out.println("You are not eligible for Senior Citizen Discount");
        }
        sc.close();
    }
}
