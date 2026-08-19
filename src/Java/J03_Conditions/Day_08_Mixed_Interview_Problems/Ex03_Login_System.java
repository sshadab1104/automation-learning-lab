package Java.J03_Conditions.Day_08_Mixed_Interview_Problems;

import java.util.Scanner;

public class Ex03_Login_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Username");
        String userName = sc.nextLine();
        System.out.println("Please enter Password");
        String password = sc.nextLine();
        String validUsername = "admin";
        String validPassword = "admin123";
        if (userName.equals(validUsername)){
            if (password.equals(validPassword)){
                System.out.println("Login Successful");
            }
            else {
                System.out.println("Invalid Password");
            }
        }
        else {
            System.out.println("Invalid Username");
        }
        sc.close();
    }
}
