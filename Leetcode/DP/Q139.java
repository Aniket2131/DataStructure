import java.util.ArrayList;
import java.util.List;

public class Q139 {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add(("code"));
        System.out.println(wordBreak(s, wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        int[] dp = new int[n];
        for(int i = 0; n > i; i++){
            for(int j = 0; i >= j; j++){
                if(wordDict.contains(s.substring(j, i+1))){
                    if(j > 0){
                        dp[i] += dp[j - 1];
                    }
                    else{
                        dp[i] += 1;
                    }
                }
            }
        }
        return dp[n - 1] > 0;
    }
}
