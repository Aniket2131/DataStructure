import java.util.PriorityQueue;

public class Q3035 {
    public static void main(String[] args) {
        String[] words = {"a","a","caa"};
        System.out.println(maxPalindromesAfterOperations(words));
    }

    public static int maxPalindromesAfterOperations(String[] words) {
        int ans = 0;
        int[] charr = new int[26];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(String st : words){
            
            for(char ch: st.toCharArray()){
                charr[ch-'a']++;
            }
            q.add(st.length());
        }
        
        int even = 0, odd = 0;
        for(int i = 0; 26 > i; i++){
            if(charr[i] != 0 && charr[i]%2 == 0) even += charr[i];
            else if(charr[i] != 0 && charr[i]%2 != 0){
                even+=charr[i] - 1;
                odd++;
            }
        }
        
        while(!q.isEmpty()){
            int el = q.poll();
            
            if(el%2 == 0){

                if(el > even) break;
                even -= el;
                ans++;
            }
            else{

                if(el == 1){
                    if(odd > 0){
                        odd--;
                    }
                    else{
                        even--;    
                    }
                    ans++;
                }
                else{
                    if(odd > 0){
                        odd--;
                        el--;
                        if(even < el) break;
                    }
                    else{
                        if(even < el) break;
                        
                    }
                    even-=el;
                    ans++;
                }
            }
        }
        return ans;
    }
}
