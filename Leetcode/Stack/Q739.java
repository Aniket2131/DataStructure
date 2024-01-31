import java.util.Stack;

public class Q739{
    public static void main(String[] args) {
        
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<int[]> s = new Stack<>();
        s.add(new int[]{temperatures[n-1], n-1});

        for(int i = n-2; i >= 0; i--){
            int el = temperatures[i];
            while(!s.isEmpty() && s.peek()[0] <= el){
                s.pop();
            }

            if(s.isEmpty()) ans[i] = 0;
            else ans[i] = s.peek()[1] - i;

            s.add(new int[]{el, i});
        }
        return ans;
    }
}