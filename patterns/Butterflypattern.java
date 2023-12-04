public class Butterflypattern {
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // now will be declaring the spaces in a line where
            // where 2*(4-1)=6 so for first line 6 spaces next 4, next 2 and 0
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
