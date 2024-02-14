public class Q2149 {
    public static void main(String[] args) {
        
    }

    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] p = new int[n/2];
        int[] ne = new int[n/2];
        int ip = 0, in = 0;
        for(int el: nums){
            if(el >= 0){
                p[ip++] = el;
            }
            else{
                ne[in++] = el;
            }
        }
        int[] ans = new int[n];
        int j = 0;
        for(int i = 0; n > i; i+=2){
            ans[i] = p[j++];
        }
        j = 0;
        for(int i = 1; n > i; i+=2){
            ans[i] = ne[j++];
        }
        return ans;
    }
}
