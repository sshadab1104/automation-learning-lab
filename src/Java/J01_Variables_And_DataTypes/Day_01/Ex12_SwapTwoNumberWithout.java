package Java.J01_Variables_And_DataTypes.Day_01;

public class Ex12_SwapTwoNumberWithout {
    public static void main(String[] args) {
        int a = 20, b = 25;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap the number: a is "+a);
        System.out.println("After swap the number: b is "+b);
    }
}
