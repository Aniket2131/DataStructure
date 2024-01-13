import java.util.HashMap;

public class Q1347{
    public static void main(String[] args) {
        String s = "bab", t = "aba";
        System.out.println(minSteps(s, t));    
    }

    public static int minSteps(String s, String t) {
        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();

        for(char ch : s.toCharArray()){
            maps.put(ch, maps.getOrDefault(ch, 0)+1);
        }
        for(char ch : t.toCharArray()){
            mapt.put(ch, mapt.getOrDefault(ch, 0)+1);
        }
        int ans = 0;
        for(char ch : maps.keySet()){
            int n = maps.get(ch);
            if(mapt.containsKey(ch)){
                int m = mapt.get(ch);
                if(n > m){
                    ans += (n - m);
                }
            }
            else{
                ans += n;
            }
        }

        return ans;
    }
}
