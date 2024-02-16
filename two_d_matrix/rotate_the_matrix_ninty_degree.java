package two_d_matrix;

public class rotate_the_matrix_ninty_degree {
    public static void main(String args[]) {
        int[][] arr = {
            { 1, 5, 4 },
            { 3, 2, 8 },
            { 9, 6, 7 },
        };
        //output should be
        /*9 3 1
          6 2 5
          7 8 4*/
        rotate(arr);
    }

    static void printrotate(int[][] rotated) {
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated[i].length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void rotate(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int[][] rotated = new int[c][r]; // Transpose the matrix to swap rows and columns
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                rotated[j][i] = arr[i][j];
            }
        }
        // Reverse each row to get the final result
        for (int i = 0; i < c; i++) {
            for (int j = 0, k = c - 1; j < k; j++, k--) {
                int temp = rotated[i][j];
                rotated[i][j] = rotated[i][k];
                rotated[i][k] = temp;
            }
        }
        System.out.println();
        printrotate(rotated);
    }
}
