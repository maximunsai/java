// 1.Sum of Two Matrices,

// 2.Multiplication of Two Matrices,


public class Matrix{

    public static void main(String[] args){

   
    int[][] matA = { 
        {1, 2, 3},
        {4, 5, 6},
        {6, 3, 9}
        };

    int[][] matB = {
        {7, 3, 5},
        {2, 4, 6},
        {9, 2, 7}
    };    

    int[][] result = new int[3][3];

    for (int i = 0; i<3; i++){
        for (int j = 0; j<3; j++){
            result[i][j] = matA[i][j] + matB[i][j];
            System.out.print(result[i][j] + "  ");
    }
        System.out.println();
   }

         System.out.println();

       for (int i = 0; i<3; i++){
        for (int j = 0; j<3; j++){
            result[i][j] = matA[i][j] * matB[i][j];
            System.out.print(result[i][j] + "  ");
    }
        System.out.println();

   }

}
}