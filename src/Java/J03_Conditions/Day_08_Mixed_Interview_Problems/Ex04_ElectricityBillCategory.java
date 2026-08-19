package Java.J03_Conditions.Day_08_Mixed_Interview_Problems;

import java.util.Scanner;

public class Ex04_ElectricityBillCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your consumed unit");
        int unit = sc.nextInt();
        if (unit < 0){
            System.out.println("Invalid input");
        } else if (unit <= 100) {
            System.out.println("Low Usage ");
        } else if (unit <= 300) {
            System.out.println("Medium Usage");
        }
        else {
            System.out.println("High Usage");
        }
        sc.close();
    }
}
