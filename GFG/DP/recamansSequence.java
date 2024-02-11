import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class recamansSequence {
    public static void main(String[] args) {
        System.out.println(recamanSequence(8));
    }

    public static ArrayList<Integer> recamanSequence(int n){
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        ans.add(0);
        for(int i = 1; n > i; i++){
            int lst = ans.get(ans.size()-1);
            
            if(lst - i > 0 && !s.contains(lst-i)){
                ans.add(lst - i);
                s.add(lst-i);
            }
            else{
                ans.add(lst+i);
                s.add(lst+i);
            }
        }
        return ans;
    }
}
