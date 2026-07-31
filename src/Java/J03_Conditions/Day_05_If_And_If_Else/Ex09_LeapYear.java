package Java.J03_Conditions.Day_05_If_And_If_Else;

import java.util.Scanner;

public class Ex09_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter year:");
        int year = sc.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year+": Leap Year");
        }
        else {
            System.out.println(year+": Not Leap Year");
        }
        sc.close();
    }
}
