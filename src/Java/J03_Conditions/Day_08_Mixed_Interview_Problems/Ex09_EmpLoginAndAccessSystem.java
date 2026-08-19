package Java.J03_Conditions.Day_08_Mixed_Interview_Problems;

import java.util.Scanner;

public class Ex09_EmpLoginAndAccessSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Employee ID:");
        int empID = sc.nextInt();
        System.out.println("Please enter your password:");
        String password = sc.nextLine();
        System.out.println("Enter Department (HR/QA/DEV/ADMIN):");
        String department = sc.nextLine().toUpperCase();
        int employeeID = 9228;
        String pwd = "admin123";
        if (empID == employeeID){
            if (pwd.equals(password)){
                System.out.println("Login successful");
                switch (department) {

                    case "HR":
                        System.out.println("Access: Employee Records");
                        break;

                    case "QA":
                        System.out.println("Access: Test Management");
                        break;

                    case "DEV":
                        System.out.println("Access: Source Code");
                        break;

                    case "ADMIN":
                        System.out.println("Access: Full Access");
                        break;

                    default:
                        System.out.println("Unknown Department");
                }
            }else {
                System.out.println("Invalid password");
            }
        }else {
            System.out.println("Invalid Employee ID");
        }
        sc.close();
    }
}
