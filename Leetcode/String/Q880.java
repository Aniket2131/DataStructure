public class Q880{
    public static void main(String[] args) {

    }

    public String decodeAtIndex(String s, int k) {
        String ans = "";
        int n = s.length();
        long size = 0;
        for(int i = 0; n > i; i++){
            char ch = s.charAt(i);
            if((ch - 'a') < 0){
                int d = ch - '0';
                size *= d;
            }
            else{
                size++;
            }
        }

        for(int i = n-1; i >= 0; i--){
            char ch = s.charAt(i);
            k %= size;
            if((k == 0) && (ch - 'a') >= 0){
                ans += ch;
                break;
            }
            else{
                if((ch - 'a') < 0){
                    int d = ch - '0';
                    size /= d;
                }
                else{
                    size--;
                }    
            }
        }
        return ans;
    }
}