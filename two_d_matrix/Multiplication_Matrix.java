package two_d_matrix;

public class Multiplication_Matrix {
    public static void main(String args[]){
        int[][] arr = {
            { 1, 5, 4,3 },
            { 3, 2, 8, 5},
        };
        int[][] arr1 = {
            { 1, 2, 8 },
            { 5, 2, 6 },
            { 7, 6, 7 },
            { 4, 3, 5 },
    };
    multiply(arr,arr1);
    }
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    static void multiply(int[][] arr, int[][] arr1){
        int r1 = arr.length;
        int c1 = arr[0].length;
        int r2 = arr1.length;
        int c2 = arr1[0].length;
        if(c1!=r2){
            System.out.println("you have provided the wrong input");
            return;
        }
        int[][] mul = new int [r1][c2]; //by default all teh values are zero
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                  mul[i][j] += (arr[i][k]*arr1[k][j]); 
                }
            }
        }
        System.out.println("ANS");
        printMatrix(mul);
        

        
    }
    
}
