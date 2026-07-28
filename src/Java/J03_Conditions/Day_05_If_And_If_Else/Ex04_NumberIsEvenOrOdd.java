package Java.J03_Conditions.Day_05_If_And_If_Else;

import java.util.Scanner;

public class Ex04_NumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println(number+": Even Number");
        }
        else {
            System.out.println(number+": Odd Number");
        }
        sc.close();
    }
}
