package Java.J01_Variables_And_DataTypes.Day_02;

import java.util.Scanner;

public class Ex06_UsingScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type your message:");
        String message = sc.nextLine();
        System.out.println(message);
    }
}
