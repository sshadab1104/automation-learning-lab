package Java.J03_Conditions.Day_08_Mixed_Interview_Problems;
import java.util.Scanner;

public class Ex09_BrowserLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Browser name:");
        String browser = sc.nextLine();
        String browserName = browser.toLowerCase();
        switch (browserName){
            case "chrome":
                System.out.println("Launching chrome");
                break;
            case "firefox":
                System.out.println("Launching Firefox");
                break;
            case "edge":
                System.out.println("Launching Edge");
                break;
            default:
                System.out.println("Unsupported Browser");
                break;
        }
        sc.close();
    }
}
