package two_d_matrix;

import java.util.Scanner;
public class Matrix {
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){ //row
            for(int j=0;j<arr[i].length;j++){ //column
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // int[][] arr = new int[2][3];
        int[][] arr2 = {
                { 1, 5, 4 },
                { 3, 2, 8 },
                { 9, 6, 7 },
        };
        // Scanner sc = new Scanner(System.in);
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // int[][] arr = new int[r][c];
        // for(int i=0;i<r;i++){ //row
        //     for(int j=0;j<c;j++){ //column
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // the order of taking input will be
        // ----
        //enter next line 
        //-----
        printArray(arr2);
    }
}
