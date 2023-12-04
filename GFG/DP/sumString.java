public class sumString {
    public static void main(String[] args) {
    }

    public String sum(String s1, String s2){
        
        StringBuilder sb = new StringBuilder();
        
        int i = s1.length() - 1, j = s2.length() - 1, sum =0, rem = 0, carry = 0;
        
        while(i >= 0 || j >= 0|| carry == 1){
            sum = (i >= 0 ? s1.charAt(i) - '0':0) + (j >= 0 ? s2.charAt(j)-'0': 0) + carry;
            
            i--;
            j--;
            carry = sum/10;
            rem = sum%10;
            sb.append(rem);
        }
        sb.reverse();
        return sb.toString();
    }
    
    public boolean check(String s, int b, int n, int m){
        
        String s1 = s.substring(b, b+n);
        String s2 = s.substring(b+n, b+n+m);
        String s3 = sum(s1, s2);
        
        if(s3.length() > s.length() - b - n -m) return false;
        
        if(s3.equals(s.substring(b+n+m, b+n+m+s3.length()))){
            if(s3.length() == s.length()-b-n-m) return true;
            
            return check(s, b+n, m, s3.length());
        }
        return false;
    }
    
    
    public int isSumString(String S){
        // code here.
        
        int n = S.length();
        
        for(int i = 1; n > i; i++){
            
            for(int j = 1; n - i > j; j++){
                
                if(check(S, 0, i, j)) return 1;
                
            }
            
        }
        
        return 0;
    }
}
