package Java.J03_Conditions.Day_08_Mixed_Interview_Problems;

import java.util.Scanner;

public class Ex05_EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your salary");
        int salary = sc.nextInt();
        System.out.println("Please enter your experience");
        double experience = sc.nextDouble();
        if (salary >= 50000 && experience >= 5){
            System.out.println("20 % Bonus");
        } else if (salary >= 30000 && experience >=3 ) {
            System.out.println("10 % Bonus");
        }
        else {
            System.out.println("No Bonus");
        }
        sc.close();
    }
}
