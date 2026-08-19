package Java.J03_Conditions.Day_08_Mixed_Interview_Problems;

import java.util.Scanner;

public class Ex07_TrafficFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a speed:");
        int speed = sc.nextInt();
        if (speed < 0 ){
            System.out.println("Invalid input");
        } else if (speed <= 60) {
            System.out.println("No fine");
        } else if (speed <= 80) {
            System.out.println("₹500 Fine");
        }
        else if (speed <= 100){
            System.out.println("₹1000 Fine");
        }
        else {
            System.out.println("₹2000 Fine");
        }
        sc.close();
    }
}
