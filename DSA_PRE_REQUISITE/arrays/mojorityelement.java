import java.util.ArrayList;
import java.util.List;

public class mojorityelement {
    public static void main(String[] args) {
        
    }

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;

        for(int el : nums){
            if(cnt1 == 0 && el != el2){
                cnt1++;
                el1 = el;
            }
            else if(cnt2 == 0 && el != el1){
                cnt2++;
                el2 = el;
            }
            else if(el == el1) cnt1++;
            else if(el == el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; 
        cnt2 = 0;
        for(int el : nums){
            if(el == el1) cnt1++;
            if(el == el2) cnt2++;
        }
        if(cnt1 > nums.length /3) ans.add(el1);
        if(cnt2 > nums.length /3) ans.add(el2);
        return ans;
    }
}
