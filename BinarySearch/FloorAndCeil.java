public class FloorAndCeil {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Wriute your code here.
        int[] arr = new int[2];
        arr[0]= Floor(a,n,x);
        arr[1] = Ceil(a,n,x);
        return arr;
    
      }
      public static int Ceil(int[] a, int n, int x){
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high){
          int mid = (low+high)/2;
          if(a[mid]>=x){
            ans = a[mid];
            high = mid-1;
          }
          else{
            low = mid+1;
          }
  
        }
      return ans;
      }
      public static int Floor(int[] a, int n, int x){
         int low1 = 0;
        int high1 = n-1;
        int ans1 = -1;
        while(low1<=high1){
          int mid1 = (low1+high1)/2;
          if(a[mid1]<=x){
            ans1 = a[mid1];
            low1 = mid1+1;
          }
          else{
            high1 = mid1-1;
          }
  
        }
      return ans1;
      }
}
