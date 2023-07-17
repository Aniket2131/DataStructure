import java.util.LinkedList;
import java.util.Queue;

public class firstNonrepeatingCharacteraStream {
    public static void main(String[] args) {
        String s = "aabc";
        System.out.println(FirstNonRepeating(s));
    }

    public static String FirstNonRepeating(String A)
    {
        // code here
        int[] cha = new int[26];
        Queue<Character> q = new LinkedList<>();
        String ans = "";
        for(int i = 0; A.length() > i; i++){
            char ch = A.charAt(i);
            cha[ch - 'a']++;
            q.add(ch);
            while(!q.isEmpty()){
                if(cha[q.peek() - 'a'] > 1){
                    q.poll();       
                }
                else {
                    ans += q.peek();
                    break;
                }
            }
            if(q.isEmpty()){
                ans += "#";
            }
        }
        return ans;
    }
}
