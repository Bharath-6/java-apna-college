package Recurssion;

public class Factorial {
    public static int factNum(int n){

        if(n==1 || n==0){
            return 1;
        }

        int Factorial= factNum(n-1);
        int Factorial1 = n * Factorial;
        return Factorial1;

    }
    public static void main(String args[]){
        int n=5;
        int ans = factNum(n);
        System.out.println(ans);
    }
    
}
