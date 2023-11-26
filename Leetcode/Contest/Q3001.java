public class Q3001 {
    public static void main(String[] args) {
        // int[][] mat = {{1, 2}};
        // int[][] mat =  {{3,3,3,3,3,3},{5,3,5,3,5,3},{2,5,2,5,2,5},
        // {8,8,8,8,8,8},{3,8,3,8,3,8},{5,3,5,3,5,3},{1,8,1,8,1,8},
        // {8,9,8,9,8,9},{2,8,2,8,2,8}};
        // int k = 4;
        // System.out.println(areSimilar(mat,k));
        // String s = "iuhoezpooxcohtlapolo";
        // System.out.println(pri(s));
        System.out.println(beautifulSubstrings("iuhoezpooxcohtlapolo", 1));
    }
   
    // Q2947
    public static int beautifulSubstrings(String s, int k) {
        int ans = 0, n = s.length();
        for(int i = 0; n > i; i++){
            int v = 0, c = 0;
            for(int j = i; j < n; j++){
                char ch = s.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') v++;
                else c++;
                if(v == c && (v*c)%k == 0) ans++;
            }
        }
        return ans;
    }

    // public static boolean areSimilar(int[][] mat, int k) {
    //     int m = mat.length;
    //     int n = mat[0].length;
    //     if(k%n == 0) return true;
    //     k %= n;
    //     for(int i = 0; m > i; i++){
    //         for(int j = 0; n/2 > j; j++){
    //             if(j+k >= n){
    //                 if(mat[i][j] != mat[i][(j+k)%n]) return false;
    //             }
    //             else{
    //                 if(mat[i][j] != mat[i][j+k]) return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
}
