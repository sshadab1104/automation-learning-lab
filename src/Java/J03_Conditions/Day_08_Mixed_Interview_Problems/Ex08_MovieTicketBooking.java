package Java.J03_Conditions.Day_08_Mixed_Interview_Problems;

import java.util.Scanner;

public class Ex08_MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Please enter Show Type (Morning / Evening)");
        String showType = sc.nextLine();
        if (age < 0){
            System.out.println("Invalid age");
        } else if (age <= 3) {
            System.out.println("Free entry");
        } else if (age <= 12) {
            System.out.println("Children Discount");
        } else if (age >= 60) {
            System.out.println("Senior Citizen Discount");
        } else {
            System.out.println("Regular Price");
        }
        sc.close();
    }
}
