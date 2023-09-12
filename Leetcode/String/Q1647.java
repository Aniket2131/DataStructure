import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q1647 {
    public static void main(String[] args) {
        
    }

    public int minDeletions(String s) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }
        Arrays.sort(arr);
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 25; i >= 0; i--){
            if(arr[i] != 0){
                int el = arr[i];
                if(set.contains(el)){
                    while(set.contains(el)){
                        ans++;
                        el--;
                    }
                }
                if(el != 0){
                    set.add(el);
                }
            }
        }
        return ans;
    }
}
