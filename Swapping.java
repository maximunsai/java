// Swapping two numbers without using a third variable


public class Swapping{
    public static void main(String[] args) {

        int a = 25;
        int b = 35;


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + " , " +  " b = " + b);
    }
}