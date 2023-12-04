import java.util.Scanner;

class Array_with_Function
{
	
	 public int peakElement(int[] arr,int n){
        int max_index=0;
        int max = arr[0];
        for(int j=1;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
                max_index=j;
            }
            
        }
        System.out.println("Result index: "+max_index);
        return max;
     }

     public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                int element=arr[i];
                // System.out.println(element);
                
                
            }
            Array_with_Function solution = new Array_with_Function();
            int result=solution.peakElement(arr,n);
            System.out.println();
            System.out.println("Result: "+result);

           

        }

    public int getMinMax(long[] a, long n) {
        return 0;
    }
}