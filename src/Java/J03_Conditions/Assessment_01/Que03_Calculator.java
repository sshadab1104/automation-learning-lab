package Java.J03_Conditions.Assessment_01;

import java.util.Scanner;

public class Que03_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber = sc.nextInt();
        System.out.println("Please enter operator(+ - * / %)");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println("Result: "+ (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Result: "+ (firstNumber / secondNumber));
                break;
            case '*':
                System.out.println("Result: "+ (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber == 0){
                    System.out.println("Cannot divide by zero.");
                }else {
                    System.out.println("Result: "+ (firstNumber / secondNumber));
                }
            case '%':
                System.out.println("Result: "+ (firstNumber % secondNumber));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
