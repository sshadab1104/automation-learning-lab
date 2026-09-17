package Java.J04_Loops.Day_12_NestedLoops;

public class Ex03_PrintNumberPairsIsNotRepeated {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int j = i + 1; j <= 5; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
