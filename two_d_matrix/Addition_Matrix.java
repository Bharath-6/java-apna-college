package two_d_matrix;

public class Addition_Matrix {
    public static void main(String args[]){
        int[][] arr = {
            { 1, 5, 4 },
            { 3, 2, 8 },
            { 9, 6, 7 },
        };
        int[][] arr1 = {
            { 1, 2, 8 },
            { 5, 2, 6 },
            { 7, 6, 7 },
    };
    sum(arr,arr1);
    }
    static void sum(int[][] arr, int[][] arr1){
        int r1 = arr.length;
        int c1 = arr[0].length;
        int r2 = arr1.length;
        int c2 = arr1[0].length;
        if(r1!=r2 || c1!=c2){
            System.out.println("Please give correct dimensions of the matrix");
            return; // where the code stops here itself
        }
        int[][] ans = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                ans[i][j] = arr[i][j]+arr1[i][j];
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
