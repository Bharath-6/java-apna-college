import java.util.Arrays;
import java.util.Scanner;

public class newtonsmissingfriends {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i+1!=arr[i]){
                int result=(i+1)*2;
                System.out.println(result);
            }
        }
    }
}
