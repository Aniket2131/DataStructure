import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Q1630{
    public static void main(String[] args) {
        int[] nums = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10}, l = {0,1,6,4,8,7}, r = {4,4,9,7,9,10};
        System.out.println(checkArithmeticSubarrays(nums, l, r));
    }

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        int m = l.length;;
        for(int i = 0; m > i; i++){
            int li = l[i], ri = r[i], k = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            while(li + k <= ri){
                pq.add(nums[li+k]);
                k++;
            }
            if(pq.size() == 1 || pq.size() == 2) ans.add(true);
            else{
                int el1 = pq.poll(), el2 = pq.poll(), dif = el2 - el1;
                boolean f = false;
                while(pq.size() > 0){
                    int el = pq.poll();
                    if(el - el2 != dif){
                        ans.add(false);
                        f = true;
                        break;
                    }
                    el2 = el;
                }
                if(!f) ans.add(true);
            }
        }
        return ans;
    }
}