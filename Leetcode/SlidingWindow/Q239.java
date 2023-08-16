import java.util.Arrays;
import java.util.Stack;

public class Q239{
    public static void main(String[] args) {
        int[] nums = {9,10,9,-7,-4,-8,2,-6};
        int k = 5;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] nge = new int[n];
        nge[n - 1] = n;
        s.push(n - 1);
        //loop for finding next greater element
        for(int i = n - 2; i >= 0; i--){
            while(!s.isEmpty() && nums[i] >= nums[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nge[i] = n;
            }
            else{
                nge[i] = s.peek();
            }
            s.push(i);
        }

        //loop for jumping on next greater element
        int j = 0;
        for(int i = 0; n - k >= i; i++){
            if(i > j) j = i;
            while(i + k > nge[j]){
                j = nge[j];
            }
            ans[i] = nums[j];
        }
        return ans;
    }
}