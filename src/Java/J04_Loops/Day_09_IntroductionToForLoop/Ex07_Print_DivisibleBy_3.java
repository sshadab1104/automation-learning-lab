package Java.J04_Loops.Day_09_IntroductionToForLoop;

public class Ex07_Print_DivisibleBy_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++){
            if (i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
