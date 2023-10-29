public class Q4 {
    public static void main(String[] args) {
        int n = 3;
        String[] str = { "abcde", "de", "fghi"};
        int k = 5;
        System.out.println(GetMax(n, k, str));
    }

    public static int GetMax(int n, int k, String s[]){
        // Code Here.       
        return solve(0, 0, "", k, s);
    }
    
    public static int solve(int ind, int strCnt, String newStr, int k, String[] s){
        
        if(ind == s.length){
            int num = cnt(newStr);
            if(num == k) return strCnt;
            else return 0;
        }
        
        int a = solve(ind+1, strCnt+1, newStr + s[ind], k, s);
        
        int b = solve(ind+1, strCnt, newStr, k, s);
        
        return Math.max(a, b);
    }
    
    public static int cnt(String s){
        int[] arr = new int[26];
        int ans = 0;
        for(int i = 0; s.length() > i; i++){
            char ch = s.charAt(i);
            if(arr[ch - 'a'] == 0) ans++;
            arr[ch - 'a']++;
        }
        return ans;
    }
}
