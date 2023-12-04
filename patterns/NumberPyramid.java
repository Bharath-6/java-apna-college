public class NumberPyramid {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            //printing the spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //printing the numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            //printing the spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
