// Switch Case with Array – Student Grade System
// input  int[] marks = {85, 72, 90, 60, 45};
 
// Marks: 85 -> Grade: B
// Marks: 72 -> Grade: C
// Marks: 90 -> Grade: A
// Marks: 60 -> Grade: D
// Marks: 45 -> Grade: F


public class Switch{
    public static void main(String[] args) {
        int[] marks = {85, 72, 90, 60, 45};
        
        for (int mark : marks){
            char grade;

            switch (mark/10){

                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                     grade = 'F';
                

            }    

            System.out.println("Marks : " + mark + " -> " + "Grade : "  + grade);
        }

    }
}