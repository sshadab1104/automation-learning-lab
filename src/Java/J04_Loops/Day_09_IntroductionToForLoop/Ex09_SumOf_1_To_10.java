package Java.J04_Loops.Day_09_IntroductionToForLoop;

public class Ex09_SumOf_1_To_10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
