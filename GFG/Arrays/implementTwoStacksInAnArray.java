public class implementTwoStacksInAnArray {
    public static void main(String[] args) {
        
    }

    int[] stArr = new int[101];
    int s = -1;
    int e = 101;
    void push1(int x)
    {
     stArr[s + 1] = x;
     s++;
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
       stArr[e - 1] = x;
       e--;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(s == -1) return -1;
        int ans = stArr[s];
        s--;
        return ans;
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(e == 101) return -1;
        int ans = stArr[e];
        e++;
        return ans;   
    }
}
