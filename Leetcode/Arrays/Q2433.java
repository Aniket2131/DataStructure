public class Q2433{
    public static void main(String[] args) {
        
    }

    public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] ans = new int[n];
        ans[0] = pref[0];
        int last = pref[0];
        for(int i = 1; n > i; i++){
            ans[i] = (last ^ pref[i]);
            last = (last ^ ans[i]);
        }
        return ans;
    }
}