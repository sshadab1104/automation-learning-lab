package Java.J03_Conditions.Day_05_If_And_If_Else;

import java.util.Scanner;

public class Ex08_Check_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a character");
        char character = sc.next().charAt(0);
        character = Character.toLowerCase(character);
        if (character == 'a' || character == 'e' || character == 'i'
                || character == 'o' || character == 'u'){
            System.out.println(character+": Vowel");
        }
        else {
            System.out.println(character+": Consonant");
        }
        sc.close();
    }
}
