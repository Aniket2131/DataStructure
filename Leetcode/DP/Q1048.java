import java.util.HashMap;
import java.util.PriorityQueue;

public class Q1048 {
    public static void main(String[] args) {
        String words[] = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
        System.out.println(longestStrChain(words));
    }
    static HashMap<String, Integer> dp;
    public static int longestStrChain(String[] words) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.len - b.len);
        for(String st : words){
            pq.add(new Pair(st.length(), st));
        }
        int i = 0;
        while(!pq.isEmpty()){
            Pair second = pq.poll();
            words[i] = second.ch;
            i++;
        }
        return solve(words, 0, "") + 1;
    }

    public static int solve(String[] words, int ind, String lstWrd){
        if(ind >= words.length) return 0;
        if(dp.containsKey(lstWrd)) return dp.get(lstWrd);
        int a = Integer.MIN_VALUE;

        if(words[ind].length() >= lstWrd.length() && match(lstWrd, words[ind])){
            a = 1 + solve(words, ind+1, words[ind]);
        }

        int b = solve(words, ind+1, lstWrd);
        dp.put(lstWrd, Math.max(a, b));
        return dp.get(lstWrd);
    }

    public static Boolean match(String w1, String w2){
        int cnt = 0;
        int i = 0;
        int j = 0;
        if(w1.length() == 0) return true;
        while(w2.length() > j){
            
            if(i >= w1.length()){
                j++;
                cnt++;
            }
            else{
                char ch1 = w1.charAt(i);
                char ch2 = w2.charAt(j);
                if(ch1 == ch2){
                    i++;
                    j++;
                }
                else{
                    j++;
                    cnt++;
                }
            }
        }
        return cnt == 1 && i == w1.length() ? true: false; 
    }

    static class Pair {
        int len;
        String ch;
        
        Pair(int len, String ch) {
            this.len = len;
            this.ch = ch;
        }
    }
}
