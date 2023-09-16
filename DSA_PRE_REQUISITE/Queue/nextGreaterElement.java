import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement{
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 9, 3, 0, 5};
        System.out.println(Arrays.toString(nextGreaterEl(arr)));    
    }

    public static int[] nextGreaterEl(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            int el = arr[i];
            while(!st.isEmpty() && st.peek() < el){
                st.pop();
            }
            if(st.isEmpty()) ans[i] = -1;
            else{
                ans[i] = st.peek();
            }

            st.push(el);
        }
        return ans;
    }


}