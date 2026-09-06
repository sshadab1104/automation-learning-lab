package Java.J04_Loops.Day_10_AdvanceForLoop;

import java.util.Scanner;

public class Ex05_PrintTableFromUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number for print the table:");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + (number*i));
        }
        sc.close();
    }
}
