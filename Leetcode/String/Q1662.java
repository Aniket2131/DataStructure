import java.util.LinkedList;
import java.util.Queue;

public class Q1662 {
    public static void main(String[] args) {
        String[] word1  = {"abc", "d", "def"}, word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n1 = word1.length, n2 = word2.length;

        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();

        int i1 = 0, i2 = 0;
        while(i1 < n1 && i2 < n2){
            String st1 = word1[i1];
            String st2 = word2[i2];

            for(char ch : st1.toCharArray()) q1.add(ch);

            for(char ch : st2.toCharArray()) q2.add(ch);

            while(!q1.isEmpty() && !q2.isEmpty()){

                char ch1 = q1.poll();
                char ch2 = q2.poll();

                if(ch1 != ch2) return false;

            }
            i1++;
            i2++;
        }

        while(i1 < n1){
            String st1 = word1[i1];

            for(char ch : st1.toCharArray()) q1.add(ch);

            while(!q1.isEmpty() && !q2.isEmpty()){

                char ch1 = q1.poll();
                char ch2 = q2.poll();

                if(ch1 != ch2) return false;

            }
            i1++;
        }

        while(i2 < n2){
            
            String st2 = word2[i2];
            for(char ch : st2.toCharArray()) q2.add(ch);

            while(!q1.isEmpty() && !q2.isEmpty()){

                char ch1 = q1.poll();
                char ch2 = q2.poll();

                if(ch1 != ch2) return false;

            }
            i2++;
        }

        return (q1.size() > 0 || q2.size() > 0) ? false : true; 
    }
}
