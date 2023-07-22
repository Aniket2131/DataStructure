import java.util.PriorityQueue;

public class Q6926{
    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
    }

    public static String sortVowels(String s) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        char[] charArray = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(char ch : s.toCharArray()){
            for(int i = 0; 10 > i; i++){
                if(ch == charArray[i]){
                    p.add((int)ch);
                    break;
                }
            }
        }
        String ans = "";
        for(char ch : s.toCharArray()){
            boolean f = false;
            for(int i = 0; 10 > i; i++){
                if(ch == charArray[i]){
                    ans += String. valueOf((char)(p.poll().intValue()));
                    f = true;
                    break;
                }
            }
            if(!f){
                ans += String. valueOf(ch);
            }
        }
        return ans;
    }
}