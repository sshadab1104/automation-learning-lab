package Java.J03_Conditions.Day_05_If_And_If_Else;

import java.util.Scanner;

public class Ex07_CheckNumberIsDivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        if(number % 5 == 0 && number % 11 == 0){
            System.out.println(number+": Number is divisible by 5 and 11");
        }
        else {
            System.out.println(number+": Number is not divisible by 5 and 11");
        }
        sc.close();
    }
}
