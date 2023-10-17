public class Q2904 {
    public static void main(String[] args) {
        // String s = "1011";
        // int k = 2;
        String s = "11000111";
        int k = 1;
        System.out.println(shortestBeautifulSubstring(s, k));
    }

    public static String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int ansi = -1, ansj = -1, len = Integer.MAX_VALUE, i = 0, j = 0, cntk = 0;
        while(j < n){
            char ch = s.charAt(j);
            if(ch == '1') cntk++;
            if(cntk >= k){
                while(j >= i && cntk >= k){
                    int diff = j-i;
                    if(diff < len){
                        ansi = i;
                        ansj = j;
                        len = diff;
                    }
                    else if(diff == len){
                        int ci = i, pi = ansi;
                        while(ci < j && pi < ansj && s.charAt(ci) == s.charAt(pi)){
                            ci++;
                            pi++;
                        }
                        if(s.charAt(pi) == '1'){
                            ansi = i;
                            ansj = j;
                        }
                    }
                    if(s.charAt(i) == '1') cntk--;
                    i++;
                }
            }
            j++;
        }
        String ans = "";
        for(int l = ansi; ansj >= l; l++){
            ans += s.charAt(l);
        }
        return ans;
    }
}
