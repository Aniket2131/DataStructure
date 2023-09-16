import java.util.Stack;

public class slidingWindowMaximum {
    public static void main(String[] args) {
        
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k + 1];
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && nums[i] >= nums[st.peek()]) st.pop();

            if(st.isEmpty()) nge[i] = n;
            else nge[i] = st.peek();

            st.push(i);
        }

        
        for(int j = 0; n - k >= j; j++){
            int i = j;
            while(nge[i] < j + k) i = nge[i];
            ans[j] = nums[i]; 
        }
        return ans;
    }
}
