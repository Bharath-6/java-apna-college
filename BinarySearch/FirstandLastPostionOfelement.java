import java.util.ArrayList;

public class FirstandLastPostionOfelement {
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int first1 = first(arr, n, k);
        int last1 = last(arr, n, k);
        int[] ans = new int[2];
        ans[0] = first1;
        ans[1] = last1;
        return ans;
    }

    public static int last(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int high = n - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == k) {
                low = mid + 1;
                last = mid;
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
                ;
            }
        }
        return last;
    }

    public static int first(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int high = n - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == k) {
                high = mid - 1;
                first = mid;
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
                ;
            }
        }
        return first;
    }
}
