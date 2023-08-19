import java.util.HashSet;
import java.util.Set;

public class Q983 {
    public static void main(String[] args) {
        int [] days = {1,4,6,7,8,20}, costs = {2,7,15};
        System.out.println(mincostTickets(days, costs));
    }
    public static int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        Set<Integer> set = new HashSet<>();
        for(int el : days) set.add(el);
        int[] dp = new int[days[n - 1] + 1];
        
        for(int i = 1; days[n - 1] >= i; i++){
            if(set.contains(i)){
                int sum = Integer.MAX_VALUE;
                sum = Math.min(sum, dp[i - 1] + costs[0]);

                if(i - 7 >= 0){
                    sum = Math.min(sum, dp[i - 7] + costs[1]);
                }

                if(i - 15 >= 0){
                    sum = Math.min(sum, dp[i - 15] + costs[2]);
                }

                dp[i] = sum;
            }
            else{
                dp[i] = dp[i - 1];
            }
        }
        return dp[days[n-1]];
    }
} 
