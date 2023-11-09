
public class Q1759 {
    public static void main(String[] args) {
        System.out.println(countHomogenous("aaa"));
    }

    public static int countHomogenous(String s) {
        long ans = 0;
        int n = s.length();
        int i = 0;
        int mod = 1000000007;
        for(int j = 0; n > j; j++){
            if(s.charAt(i) == s.charAt(j)){
                ans += (j-i+1);
            }
            else{
                i = j;
                ans += 1;
            }
        }
        return (int)(ans%mod);
    }
}
