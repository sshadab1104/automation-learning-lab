package Java.J03_Conditions.Day_05_If_And_If_Else;

import java.util.Scanner;

public class Ex01_CheckPositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        if (number > 0){
            System.out.println(number+": Positive Number");
        }
        sc.close();
    }
}
