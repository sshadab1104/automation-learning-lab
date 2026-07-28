package Java.J01_Variables_And_DataTypes.Day_01;

public class Ex11_SwapTwoNumberWithThirdVariable {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap the number: a is "+a);
        System.out.println("After swap the number: b is "+b);
    }
}
