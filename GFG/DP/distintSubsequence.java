import java.util.HashMap;

public class distintSubsequence{
    public static void main(String[] args) {
        System.out.println(distinctSubsequences("abca"));
    }

    public static int distinctSubsequences(String S) {
        // code here
        int n = S.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int e = 1000000007;
        HashMap<Character, Integer> map =new HashMap<>();
        for(int i = 1; n >= i; i++){
            dp[i] = (2 * dp[i-1])%e;
            char ch = S.charAt(i-1);
            if(map.containsKey(ch)){
                int j = map.get(ch) % e;
                dp[i] = (dp[i] - dp[j-1])%e;
            }
            if(dp[i] <= 0){
                dp[i] += e;
            }
            map.put(ch, i);
        }
        return dp[n];        
    }
}