import java.util.Scanner;

public class min_max_array {
    public static long[] getMinMax(long a[], long n){
        Long Min=a[0];
        long Max=0;
        for(int j=1;j<a.length;j++){
            if(a[j]>Min){
                Max=a[j];
            }
            else{
                Min=a[j];
            }
        }
        long[] result={Min,Max};
        return result;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long a[]=new long[(int) n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextLong();

        }
       long[] result = getMinMax(a, n);
       System.out.println("Minmum"+result[0]);
        System.out.println("Maximum"+result[1]);

    }
}

