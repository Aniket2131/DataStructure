import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2761{
    public static void main(String[] args) {
        System.out.println(findPrimePairs(10));
    }

    public static List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        Boolean[] bool = new Boolean[n + 1];
        Arrays.fill(bool, true);
        bool[0] = false;
        bool[1] = false;
        for(int i = 0; n >= i*i; i++){
            if(bool[i]){
                for(int j = 2 * i; n >= j; j = j + i){
                    if(bool[j]){
                        bool[j] = false;
                    }
                }
            }
        }
        for(int i = 2; n >= i+i; i++){
            if(bool[i]){
                int j = n - i;
                if(j > 1 && bool[j]){
                    ArrayList<Integer> il = new ArrayList<>();
                    il.add(i);
                    il.add(j);
                    ans.add(il);
                }
            }
        }

        return ans;
    }
}