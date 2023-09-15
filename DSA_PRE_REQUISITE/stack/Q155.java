import java.util.Stack;

public class Q155{
    public static void main(String[] args) {
        
    }

    class MinStack {
    Stack<Integer> minstack;
    Stack<Integer> st;
    public MinStack() {
        minstack = new Stack<>();
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minstack.isEmpty() || minstack.peek() >= val){
            minstack.push(val);
        }
    }
    
    public void pop() {
        if(st.peek().equals(minstack.peek())){
            minstack.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
}