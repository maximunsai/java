// For Loop with Array – Find Maximum and Minimum Value
 
// input:-  int[] numbers = {34, 78, 12, 56, 89, 23, 67};
// output:-Maximum number: 89
//         Minimum number: 12

public class Array {
    public static void main(String[] args) {
        
        int[] numbers = {34, 78, 12, 56, 89, 23, 67};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
            if (numbers[i] < min) {
                min = numbers[i]; 
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}