import java.util.HashMap;
import java.util.Map;

public class longestSubarrayWithSumDivisibleByK {
    public static void main(String[] args) {
        int A[] = { 2, 7, 6, 1, 4, 5 };
        System.out.println(longSubarrWthSumDivByK(A, A.length, 3));
    }

    public static int longSubarrWthSumDivByK(int a[], int n, int k) {
        // Complete the function
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        int rem = 0;
        map.put(0, -1);
        for (int i = 0; n > i; i++) {
            sum += a[i];
            rem = sum % k;
            if (0 > rem)
                rem += k;
            if (map.containsKey(rem)) {
                ans = Math.max(ans, i - map.get(rem));
            } else {
                map.put(rem, i);
            }
        }
        return ans;
    }
}
