import java.util.HashMap;
import java.util.HashSet;

public class Q1930 {
    public static void main(String[] args) {
        String s = "bbcbaba";
        System.out.println(countPalindromicSubsequence(s));
    }

    public static int countPalindromicSubsequence(String s) {
        int n = s.length();
        HashMap<Character, Integer> l = new HashMap<>();
        HashMap<Character, Integer> r = new HashMap<>();
        
        for(int i = 0; n > i; i++){
            char ch = s.charAt(i);
            if(!l.containsKey(ch)){
                l.put(ch, i);
            }
            if(!r.containsKey(s.charAt(n-i-1))){
                r.put(s.charAt(n-i-1), n-i-1);
            }
        }
        int ans = 0;
        for(int i = 0; n > i; i++){
            char ch = s.charAt(i);
            if(i == l.get(ch) && l.get(ch) != r.get(ch)){
                int unq = unique(l.get(ch)+1, r.get(ch)-1, s);
                ans += unq;
            }
        }
        return ans;
    }

    public static int unique(int i, int j, String s){
        HashSet<Character> set = new HashSet<>();
        for(int k = i; k <= j; k++){
            set.add(s.charAt(k));
        }
        return set.size();
    }
}
