import java.util.HashMap;
import java.util.Map;

public class Q474 {
    public static void main(String[] args) {
        String strs[] = {"10","0001","111001","1","0"};
        int m = 5, n = 3;
        System.out.println(findMaxForm(strs, m, n));
    }

    public static Map<String, Integer> dp;
    public static int findMaxForm(String[] strs, int m, int n) {
        dp = new HashMap<>();
        return helper(strs,m,n,0);
    }

    public static int helper(String[] str, int m, int n, int ind){
        if(m == 0 && n == 0) return 0;

        if(ind >= str.length) return 0;

        String key = m + "->" + n + "->" + ind;

        if(dp.containsKey(key)) return dp.get(key);

        int one = 0, zero = 0;
        for(char ch : str[ind].toCharArray()){
            if(ch == '1') one++;
            else{
                zero++;
            }
        }

        int taken = 0;
        if(one <= n & zero <= m){
            taken = 1 + helper(str, m - zero, n - one, ind+1);
        }

        int notTaken = helper(str, m, n, ind+1);

        int total = Math.max(taken, notTaken);
        dp.put(key, total);
        return total;
    }
}
