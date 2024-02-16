package two_d_matrix;

import java.util.Scanner;

public class N_Square_Spiral_Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix=sprialSquare(n);
        printmat(matrix);
    }

    static void printmat(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] sprialSquare(int n){
        int[][] matrix = new int[n][n];
        int r = matrix.length;
        int c = matrix[0].length;
        int toprow = 0, bottomrow = n-1, leftcol = 0,rightcol=n-1;
        int curr = 1;
        while(curr<=n*n){
            // toprow -> left col to right col
            for(int j=leftcol;j<=rightcol && curr<=n*n;j++){
                matrix[toprow][j]=curr; // where we will be in zero and moving to left
                curr++;
            }
            toprow++;
            //rightcol -> toprow to bottomrow
            for(int i=toprow;i<=bottomrow && curr<=n*n;i++){
                matrix[i][rightcol]=curr;
                curr++;
            }
            rightcol--;
            //bottom row -> right to left
            for(int j= rightcol;j>=leftcol && curr<=n*n;j--){
                matrix[bottomrow][j]=curr;
                curr++;
            }
            bottomrow--;
            //left col -> bottom row to top row
            for(int i=bottomrow;i>=toprow && curr<=n*n;i--){
                matrix[i][leftcol]=curr;
                curr++;
            }
            leftcol++;

        }
        return matrix;
    }
}
