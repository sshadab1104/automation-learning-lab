package Java.J04_Loops.Day_10_AdvanceForLoop;

public class Ex10_PrintNumbers_1_100_Divisible_4_Not_8 {
    public static void main(String[] args) {
        for (int i = 4; i <= 100; i+=4){
            if ( i % 8 != 0){
                System.out.print(i+" ");
            }
        }
    }
}
