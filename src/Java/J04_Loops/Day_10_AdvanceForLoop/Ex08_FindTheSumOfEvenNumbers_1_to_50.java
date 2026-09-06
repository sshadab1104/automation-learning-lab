package Java.J04_Loops.Day_10_AdvanceForLoop;

public class Ex08_FindTheSumOfEvenNumbers_1_to_50 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 50; i+=2){
            sum = sum + i;
        }
        System.out.println("Sum = "+sum);
    }
}
