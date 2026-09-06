package Java.J04_Loops.Day_10_AdvanceForLoop;

public class Ex06_CountEvenNumber_1_To_100 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                count ++;
            }
        }
        System.out.println("Total Even Numbers = "+count);
    }
}