package J01_Variables_And_DataTypes.Day_01;

import java.util.Scanner;

public class Ex08_PrintSumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int n = sc.nextInt();
        System.out.println("Please enter second number");
        int n1 = sc.nextInt();
        int sum = n+n1;
        System.out.println(sum);
    }
}
