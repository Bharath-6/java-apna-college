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
    static void multiply(int[][] arr, int[][] arr1){
        int r1 = arr.length;
        int c1 = arr[0].length;
        int r2 = arr1.length;
        int c2 = arr1[0].length;
        if(c1!=r2){
            System.out.println("you have provided the wrong input");
            return;
        }
        int[][] = new [r1][c1];
        for(int i=0;i<)

        
    }
    
}
