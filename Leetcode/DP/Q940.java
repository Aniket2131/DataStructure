import java.util.HashMap;

public class Q940 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(distinctSubseqII(s));
    }

    public static int distinctSubseqII(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int e = 1000000007;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 1; n >= i; i++){
            dp[i] = (2 * dp[i - 1]) % e;
            char ch = s.charAt(i - 1);
            if(map.containsKey(ch)){
                int j = map.get(ch) % e;
                dp[i] = (dp[i] - dp[j - 1]) % e;
            }
            if(dp[i]<=0){
                dp[i] += e;
            }
            map.put(ch, i);
        }
        return (dp[n] - 1) % e;
    }
}
