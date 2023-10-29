import java.util.Stack;

public class Q5 {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4};
        // int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {1, 2, 9, 8, 3, 4};
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 20, 21, 1, 1, 1, 1, 1, 1};
        System.out.println(MaximumScore(arr.length, 5, arr));   
    }

    public static long MaximumScore(int N, int K, int arr[]){
        // Code Here.
        int s = K;
        int e = N;
        int ans = Integer.MIN_VALUE;
        while(s <= e){
            int sum = 0;
            int i = 0;
            while(i < N && N % s == 0){
                int max = Integer.MIN_VALUE;
                int j = 0;
                while(j < s){
                    max = Math.max(max, arr[i+j]);
                    j++;
                }
                i = j + i;
                sum += max;

            }
            ans = Math.max(ans, sum);
            s++;
        }
        return ans;
    }

    // public static String LowerToUpper(String s) {
    //     // code here
    //     StringBuffer st = new StringBuffer();
    //     int n = s.length();
    //     char ch = s.charAt(0);
    //     st.append(s.charAt(0));
    //     for(int i = 1; n > i; i++){
    //         char cha = s.charAt(i);
    //         if(cha == ch){
    //             String temp = (cha+"").toUpperCase();
    //             st.deleteCharAt(st.length()-1);
    //             st.append(temp.charAt(0));
    //             ch = '#';
    //         }
    //         else{
    //             ch =  cha;
    //             st.append(ch);
    //         }
    //     }

    //     return st.toString(); 
    // }
    // public static String LowerToUpper(String s) {
    //     // code here
    //     StringBuffer st = new StringBuffer();
       
    //     int n = s.length();
    //     Stack<Character> sta = new Stack<>(); 
    //     sta.push(s.charAt(0));
    //     for(int i = 1; n > i; i++){
    //         char cha = s.charAt(i);
    //         if(sta.peek() == cha){
    //             sta.pop();
    //             String temp = (cha + "").toUpperCase();
    //             sta.push(temp.charAt(0));
    //         }
    //         else{
    //             sta.push(cha);
    //         }
    //     }
    //     while(!sta.isEmpty()){
    //         st.append(sta.pop());
    //     }
    //     return st.reverse().toString();
    // }

    
}
