package Java.J03_Conditions.Day_08_Mixed_Interview_Problems;

import java.util.Scanner;

public class Ex06_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = sc.nextInt();
        System.out.println("Please enter operator");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println("Result: "+ (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Result: "+ (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Result: "+ (firstNumber * secondNumber));
                break;
            case '/':
                System.out.println("Result: "+ (firstNumber / secondNumber));
                break;
        }
        sc.close();
    }
}
