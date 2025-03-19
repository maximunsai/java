public class Method {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;

        if (isEven(num1)) {
            System.out.println(num1 + " is even (static method).");
        } else {
            System.out.println(num1 + " is odd (static method).");
        }

        Method obj = new Method();
        if (obj.isEven(num2)) {
            System.out.println(num2 + " is even (non-static method).");
        } else {
            System.out.println(num2 + " is odd (non-static method).");
        }
    }
}
