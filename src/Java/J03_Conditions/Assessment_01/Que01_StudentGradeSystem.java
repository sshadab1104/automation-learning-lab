package Java.J03_Conditions.Assessment_01;

import java.util.Scanner;

public class Que01_StudentGradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Please enter your marks:");
        int marks = sc.nextInt();
        if (marks > 100 || marks < 0){
            System.out.println("Invalid marks entered");
        } else if (marks >= 90) {
            System.out.println("A+");
        }
        else if (marks >= 75) {
            System.out.println("A");
        }
        else if (marks >= 60) {
            System.out.println("B");
        }
        else if (marks >= 35) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
