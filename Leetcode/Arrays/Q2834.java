import java.util.HashSet;
import java.util.Set;

public class Q2834 {
    public static void main(String[] args) {
        
    }

    public long minimumPossibleSum(int n, int target) {
        Set<Long> set = new HashSet<>();
        long sum=0;
        for(long i = 1; set.size() < n; i++){
            if(!set.contains(target - i)){
                sum += i;
                set.add(i);
            }
    
        }
        return sum;
        
    }
}
