package Java.J03_Conditions.Day_06_Nested_If_And_If_Else;

import java.util.Scanner;

public class Ex02_ATM_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is card inserted? Enter true or false:");
        boolean cardInserted = sc.nextBoolean();
        System.out.println("Please enter your PIN");
        int pin = sc.nextInt();
        int correctPin = 1548;
        if (cardInserted){
            if (pin == correctPin){
                System.out.println("Allow to withdrawal");
            }
        }
        else {
            System.out.println("Invalid verification");
        }
        sc.close();

    }
}
