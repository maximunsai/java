// While Loop with Array – Reverse an Array
 
// input :-  int[] arr = {5, 10, 15, 20, 25};
// Reversed Array:
// 25 20 15 10 5

public class Reverse {  
    public static void main(String[] args) {  
         
        int [] arr = new int [] {5, 10, 15, 20, 25};  
        
        System.out.println(arr.length);


        int i = arr.length - 1;
        while (i >= 0) {  
            System.out.print(arr[i] + " ");  
            i--;
        }  
    }  
}  
