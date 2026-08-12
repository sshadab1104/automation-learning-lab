package Java.J03_Conditions.Day_08_Mixed_Interview_Problems;

import java.util.Scanner;

public class Ex02_StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter student name:");
        String name = sc.nextLine();
        System.out.println("Please enter student marks:");
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100){
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
        } else if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 75 ) {
            System.out.println("A");
        } else if (marks >= 60) {
            System.out.println("B");
        } else if (marks >= 35) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
