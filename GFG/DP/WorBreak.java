import java.util.ArrayList;

public class WorBreak {
    public static void main(String[] args) {
        String A = "ilikesamsung";
        ArrayList<String> B = new ArrayList<>();
        B.add( "i");
        B.add( "like");
        B.add( "sam");
        System.out.println(wordBreak(A, B));

    }

    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
        int n = A.length();
        int[] dp = new int[n];
        for(int i = 0; n > i; i++){
            for(int j = 0; i >= j; j++){
                if(B.contains(A.substring(j, i+1))){
                    if(j > 0){
                        dp[i] += dp[j - 1];
                    }
                    else{
                        dp[i] += 1;
                    }
                }
            }
        }
        return dp[n - 1] > 0 ? 1: 0;
    }
}
