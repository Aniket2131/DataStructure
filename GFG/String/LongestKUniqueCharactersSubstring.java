import java.util.HashMap;

public class LongestKUniqueCharactersSubstring{
    public static void main(String[] args) {
        String S = "aaa";
        int K = 2;
        System.out.println(longestkSubstr(S, K));
    }

    public static int longestkSubstr(String s, int k) {
        // code here
        int ans = -1;
        int i = 0;
        int j = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        while(i < n && j < n){
            if(map.size() < k | map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                j++;
            }
            else{
                ans = Math.max(ans, j - i);
                int a = map.get(s.charAt(i)) - 1;
                map.put(s.charAt(i), a);
                if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                i++;
            }
        }
        if(map.size() == k){
            ans = Math.max(ans, j - i);
        }
        return ans;
    }
}
