package two_d_matrix;

public class Spiral_Matrix {
    public static void main(String args[]) {
        int[][] arr = {
                { 1, 5, 4 },
                { 3, 2, 8 },
                { 9, 6, 7 },
        };
        sprial(arr);
    }

    static void printmat(int[][] trans) {
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[i].length; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sprial(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        int toprow = 0, bottomrow = r-1, leftcol = 0,rightcol=c-1;
        while(bottomrow>=toprow){
            // toprow -> left col to right col
            for(int j=leftcol;j<=rightcol;j++){
                System.out.print(arr[toprow][j]+" "); // where we will be in zero and moving to left

            }
            toprow++;
            //rightcol -> toprow to bottomrow
            for(int i=toprow;i<=bottomrow;i++){
                System.out.print(arr[i][rightcol]+" ");
            }
            rightcol--;
            //bottom row -> right to left
            for(int j= rightcol;j>=leftcol;j--){
                System.out.print(arr[bottomrow][j]+" ");
            }
            bottomrow--;
            //left col -> bottom row to top row
            for(int i=bottomrow;i>=toprow;i--){
                System.out.print(arr[i][leftcol]+" ");
            }
            leftcol++;

        }
    }
}
