import java.util.HashMap;
import java.util.Map;

public class Q1218{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4}, difference = 1;
        System.out.println(longestSubsequence(arr, difference));
    }

    public static int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> dp = new HashMap<>();
        
        int ans = 1;
        for(int el : arr){
            if(dp.containsKey(el - difference)){
                dp.put(el, dp.get(el - difference) + 1);
                ans = Math.max(dp.get(el), ans);
            }
            else{
                dp.put(el, 1);
            }
        }
        return ans;
    }
}