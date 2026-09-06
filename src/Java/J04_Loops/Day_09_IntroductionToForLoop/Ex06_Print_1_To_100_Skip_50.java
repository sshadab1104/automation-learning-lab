package Java.J04_Loops.Day_09_IntroductionToForLoop;

public class Ex06_Print_1_To_100_Skip_50 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i == 50){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
