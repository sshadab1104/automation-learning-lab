package Java.J03_Conditions.Day_05_If_And_If_Else;

import java.util.Scanner;

public class Ex06_CheckNumberIsDivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        if(number % 5 == 0){
            System.out.println(number+": Number is divisible by 5");
        }
        else {
            System.out.println(number+": Number is not divisible by 5");
        }
        sc.close();
    }
}
