public class trappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));        
    }

     public static int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int leftmax = 0;
        int rightmax = 0;
        int ans = 0;
        while(r > l){
            if(height[r] >= height[l]){
                if(height[l] >= leftmax) leftmax = height[l];
                else{
                    ans += leftmax - height[l];
                }
                l++;
            }
            else{
                if(height[r] >= rightmax) rightmax = height[r];
                else{
                    ans += rightmax - height[r];
                }
                r--;
            }
        }
        return ans;
    }


    // space complexity = O(2N)

    // public static int trap(int[] height) {
    //     int n = height.length;
    //     int[] pre = new int[n];
    //     int[] suf = new int[n];

    //     int max = Integer.MIN_VALUE;
    //     int maxsuf = Integer.MIN_VALUE;
    //     for(int i = 0; n > i; i++){
    //         pre[i] = Math.max(height[i], max);
    //         max = pre[i];
    //         suf[n - i - 1] = Math.max(height[n-i-1], maxsuf);
    //         maxsuf = suf[n-i-1];
    //     }

    //     int ans = 0;
    //     for(int i = 0; n > i; i++){
    //         ans += Math.min(pre[i],suf[i]) - height[i];
    //     }
    //     return ans;
    // }
}
