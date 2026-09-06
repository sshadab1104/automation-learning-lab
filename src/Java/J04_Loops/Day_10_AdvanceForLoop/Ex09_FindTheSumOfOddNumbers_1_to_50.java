package Java.J04_Loops.Day_10_AdvanceForLoop;

public class Ex09_FindTheSumOfOddNumbers_1_to_50 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 49; i+=2){
            sum = sum + i;
        }
        System.out.println("Sum = "+sum);
    }
}
