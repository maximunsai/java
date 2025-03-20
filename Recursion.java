public class Recursion{
    public static void main(String[] args){
        int result = factorial(10);
        System.out.println("Factorial of 10 is : " + result); 

    }

    public static int factorial(int n){
        if (n == 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}

