package Java.J04_Loops.Day_10_AdvanceForLoop;

import java.util.Scanner;

public class Ex12_MiniChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter total number of students:");
        int students = sc.nextInt();
        for (int i = 1; i <= students; i++){
            System.out.println("Roll No "+ i + ": Present");
        }
        sc.close();
    }
}
