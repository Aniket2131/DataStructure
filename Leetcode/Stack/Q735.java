import java.util.Stack;

public class Q735{
    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        System.out.println(asteroidCollision(asteroids));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int el : asteroids){
            if(st.isEmpty() || (0 > st.peek() && el > 0) || (st.peek() > 0 && el > 0 || 0 > st.peek() && 0 > el)){
                
                st.push(el);
            }
            else{
                while(!st.isEmpty() && st.peek() > 0 && Math.abs(el) > st.peek()){
                    st.pop();
                }
                if(st.isEmpty() || 0 > st.peek()) st.push(el);
                else if(st.peek() == Math.abs(el)) st.pop();
            }
        }
        int[] ans = new int[st.size()];
        int n = st.size() - 1;
        while(!st.isEmpty()) ans[n--]  = st.pop();
        return ans;
    }
}