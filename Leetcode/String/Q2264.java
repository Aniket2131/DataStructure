public class Q2264 {
    public static void main(String[] args) {
        
    }

    public String largestGoodInteger(String num) {
        int ans = -1;
        int i = 0;

        while(i < num.length()){

            char ch = num.charAt(i);
            int n = Integer.parseInt(ch + "");
            int cnt = 1;
            i++;
            while(n > ans && num.length() > i && num.charAt(i) == ch){
                cnt++;
                i++;
            }
            if(cnt >= 3) ans = n;
        }

        if(ans == -1) return "";
        String s = "";
        int j = 0;
        while(j < 3){
            s += ans;
            j++;
        }
        return s;
    }
}
