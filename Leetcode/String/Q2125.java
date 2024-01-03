public class Q2125 {
    public static void main(String[] args) {
        
    }

    public int numberOfBeams(String[] bank) {
        int pre = 0, ans = 0;
        for(String s: bank){
            int cnt = 0;
            for(char ch : s.toCharArray()){

                if(ch == '1') cnt++;

            }
    
            if(cnt == 0) continue;

            else {
                if(pre == 0) pre = cnt;
                else{
                    ans += (pre * cnt);
                    pre = cnt;
                }
            }
        }
        return ans;
    }
}
