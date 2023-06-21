import java.util.HashMap;
import java.util.Map;

public class longestSub_ArrayWithSumK {
    public static void main(String[] args) {
        int A[] = { 10, 5, 2, 7, 1, 9 };
        System.out.println(lenOfLongSubarr(A, A.length, 15));
    }

    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Complete the function
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for (int i = 0; N > i; i++) {
            sum += A[i];
            if (sum == K)
                ans = Math.max(ans, i + 1);
            if (map.containsKey(sum - K)) {
                ans = Math.max(ans, i - map.get(sum - K));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return ans;
    }
}
