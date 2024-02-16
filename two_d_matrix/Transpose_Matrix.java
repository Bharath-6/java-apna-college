package two_d_matrix;

public class Transpose_Matrix {
    public static void main(String args[]){
        int[][] arr = {
            { 1, 5, 4 },
            { 3, 2, 8 },
            { 9, 6, 7 },
        };
        //output should be
        /*1 3 9
        5 2 6
        4 8 7*/
    transpose(arr);
    }
    static void printmat(int[][] trans){
        for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[i].length;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transpose(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        int[][] trans = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                trans[i][j] = arr[j][i];
            }
        }
        System.out.println();
        printmat(trans);
    }
}
