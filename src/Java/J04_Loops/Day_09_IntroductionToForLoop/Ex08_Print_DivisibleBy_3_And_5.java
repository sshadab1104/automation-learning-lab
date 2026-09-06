package Java.J04_Loops.Day_09_IntroductionToForLoop;

public class Ex08_Print_DivisibleBy_3_And_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
