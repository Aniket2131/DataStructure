public class compression{
    public static void main(String[] args) {
        
    

    }

    public int compress(char[] chars) {
        char c = chars[0];
        int cnt = 1;
        String s = chars[0] + "";
        for(int i = 1; chars.length > i; i++){
            char ch = chars[i];
            if(ch == c) cnt++;
            else{
                if(cnt > 1) s += cnt; 
                c = ch;
                cnt = 1;
                s += ch + "";
            }
        }
        if(cnt > 1) s += cnt;
        for(int i = 0; s.length() > i; i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}