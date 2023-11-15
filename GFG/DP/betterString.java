import java.util.HashMap;

public class betterString {
    public static void main(String[] args) {
        String str1 = "gboubwd", str2 = "bekoilx";
        System.out.println(betterStrin(str1, str2));
    }

    public static String betterStrin(String str1, String str2) {
        // Code here
        int n = str1.length();
        int[] dp1 = new int[n+1];
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int[] dp2 = new int[n+1];
        dp1[0] = 1;
        dp2[0] = 1;
        for(int i = 1; n >= i; i++){
            dp1[i] = 2 * dp1[i-1];
            dp2[i] = 2 * dp2[i-1];
            char ch1 = str1.charAt(i-1), ch2 = str2.charAt(i-1);
            if(map1.containsKey(ch1)){
                int v = map1.get(ch1);
                dp1[i] -= dp1[v-1];
            }
            if(map2.containsKey(ch2)){
                int v = map2.get(ch2);
                dp2[i] -= dp2[v-1];
            }
            map1.put(ch1, i);
            map2.put(ch2, i);
        }
        return dp1[n] < dp2[n] ? str2 : str1;
    }
}
