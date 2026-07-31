package Java.J03_Conditions.Day_06_Nested_If_And_If_Else;

import java.util.Scanner;

public class Ex_01_CheckStudentEligibilityForScholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter student marks:");
        int marks = sc.nextInt();
        System.out.println("Please enter student attendance:");
        int attendance = sc.nextInt();
        if (marks >= 80) {

            if (attendance >= 75) {
                System.out.println("Scholarship Approved");
            } else {
                System.out.println("Scholarship Rejected");
                System.out.println("Reason : Attendance below 75%");
            }

        } else {
            System.out.println("Scholarship Rejected");
            System.out.println("Reason : Marks below 80%");
        }
        sc.close();
    }
}
