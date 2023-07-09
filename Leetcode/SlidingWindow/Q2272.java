import java.util.HashSet;
import java.util.Set;

public class Q2272{
    public static void main(String[] args) {
        String  s = "aababbb";
        System.out.println(largestVariance(s));
    }

    public static int largestVariance(String s) {
        int c1 = 0;
        int c2 = 0;
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()) set.add(ch);

        for(int i = 0; 2 > i; i++){
            for(char ch1 : set){
                for(char ch2 : set){
                    if(ch1 == ch2) continue;

                    c1 = c2 = 0;

                    for(char ch : s.toCharArray()){
                        if(ch == ch1) c1++;

                        else if(ch == ch2) c2++;

                        if(c2 > c1) c1 = c2 = 0;

                        else if( c1 > 0 && c2 > 0){
                            ans = Math.max(ans, c1 - c2);
                        }
                    }
                }
            }
            s = new StringBuilder(s).reverse().toString();
        }
        return ans;
    }
}