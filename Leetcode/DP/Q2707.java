import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q2707 {
    public static void main(String[] args) {
        String s = "leetscode", dictionary[] = {"leet","leets","code","leetcode"};
        System.out.println(minExtraChar(s, dictionary));
    }

    static Set<String> set;
    static int n;
    static int[] dp;
    public static int minExtraChar(String s, String[] dictionary) {
        set = new HashSet<>();
        n = s.length();
        dp = new int[n + 1];
        for(String st : dictionary){
            set.add(st);
        }
        Arrays.fill(dp, -1);
        
        return n - solve(s, 0);
    }
    
    public static int solve(String s, int ind){
        if(ind >= n) return 0;
        
        int max = 0;
        
        for(int i = ind; n > i; i++){
            int sum = 0;
            String temp = s.substring(ind, i + 1);
            if(set.contains(temp)){
                sum = i - ind + 1;
            }
            sum += solve(s, i+1);
            max = Math.max(max, sum);   
        }
    
        return dp[ind] = max;
    }

}
