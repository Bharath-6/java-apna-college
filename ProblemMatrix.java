// question:Take a matrix as input from the user.Search for a given number x and print the indices at which it occurs

import java.util.*;

public class ProblemMatrix {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        // Declaration of 2D array
        // type[][] arrayName = new type[rows][columns];
        // int[][] numbers = new int[3][5];
        int[][] numbers = new int[rows][cols];
        // input
        // row
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare now
                if (numbers[i][j] == x) {
                    System.out.println("x found at location:(" + i + "," + j + ")");
                }

            }

        }
    }

}
