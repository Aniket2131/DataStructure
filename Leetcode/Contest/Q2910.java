import java.util.Arrays;

public class Q2910 {
    public static void main(String[] args) {
        System.out.println(minimumSteps("11000111"));
    }

    public static long minimumSteps(String s) {
        long ans = 0;
        if(s.length() == 1) return ans;
        int n = s.length();
        StringBuffer st = new StringBuffer(s);
        int i = 0, j = n-1;
        while(j >= i){
            if(st.charAt(i) == '1' && st.charAt(j) == '0'){
                if(j - i < 0) break;
                else{
                    ans += (j - i);
                    st.replace(i, i+1, "0");
                    st.replace(j, j+1, "1");
                    
                }
            }
            if(st.charAt(i) == '0') i++;
            if(st.charAt(j) == '1') j--;
            
        }
        // long ans = 0;
        // int n = s.length();
        // StringBuffer st = new StringBuffer(s);
        // for(int i = 0; n > i; i++){
        //     char ch = st.charAt(i);
        //     if(ch == '1'){
        //         int j = i+1;
        //         while(j < n && st.charAt(j) == '1') j++;
        //         if(j == n) break;
        //         else{
        //             long cnt = j - i;
        //             ans += cnt;
        //             st.replace(i, i+1, "0");
        //             st.replace(j, j+1, "1");
        //         }
        //     }
        // }
        return ans;
    }
}
