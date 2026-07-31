package Java.J03_Conditions.Day_05_If_And_If_Else;

import java.util.Scanner;

public class Ex03_CheckWhetherStudentPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks:");
        int marks = sc.nextInt();
        if(marks >= 35){
            System.out.println("You are passed");
        }
        else {
            System.out.println("You are failed");
        }
        sc.close();
    }
}
