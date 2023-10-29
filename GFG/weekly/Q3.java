import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        String s = "1231";
        System.out.println(CountStrings(s));
    }

    public static int CountStrings(String s){
        // Code Here.
        int n = s.length();
        int cnt = 0;
        for(int i = 0; n > i; i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            int maxDigit = 0;
            int maxfreq = 0;
            for(int j = i; j < n; j++){
                int num = Integer.parseInt(s.charAt(j) + "");
                map.put(num, map.getOrDefault(num, 0) +1);
                maxfreq = Math.max(maxfreq, map.get(num));
                maxDigit = Math.max(maxDigit, num);
                if(maxDigit > maxfreq) cnt++;
            }
        }
        return cnt;
    }
}
