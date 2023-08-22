import java.util.HashSet;
import java.util.Set;

public class Q6450 {
        public static void main(String[] args) {
            System.out.println(minimumSum(27, 49));
        }

        public static int minimumSum(int n, int k) {
        int[] nums = new int[n];
        Set<Integer> s = new HashSet<>();
        int sum = 0;
        int j = 0;
        for(int i = 1; 1000 >= i; i++){
            if(!s.contains(k - i)){
                nums[j++] = i;
                sum += i;
                s.add(i);
                if(j == n - 1) break;
            }
        }
        return sum;
    }
}
