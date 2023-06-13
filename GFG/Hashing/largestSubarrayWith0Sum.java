import java.util.HashMap;

public class largestSubarrayWith0Sum {
    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(maxLen(arr, arr.length));
    }

    public static int maxLen(int arr[], int n) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        for (int i = 0; n > i; i++) {
            sum += arr[i];
            if (sum == 0) {
                ans = i + 1;
            } else {
                if (map.get(sum) != null) {
                    ans = Math.max(ans, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return ans;
    }
}
