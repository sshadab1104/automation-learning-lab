package Java.J04_Loops.Day_09_IntroductionToForLoop;

import java.util.Scanner;

public class Ex10_MiniChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
