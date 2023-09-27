import java.util.ArrayList;
public class closestPairFromtwoArray{
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 7};
        int brr[] = {10, 20, 30, 40};
        int n = 4, m = 4, x = 50;
        System.out.println(printClosest(arr, brr, n, m, x));
    }

    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = m-1;
        int d = Integer.MAX_VALUE;
        while(i < n && j >= 0){
            int sum = arr[i] + brr[j];
            if(Math.abs(sum - x) < d){
                d = Math.abs(sum-x);
                ans.add(0, arr[i]);
                ans.add(1, brr[j]);
            }
            if(sum > x) j--;
            else i++;
        }
        return ans;
    }
}