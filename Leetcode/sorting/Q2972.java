public class Q2972 {
    public static void main(String[] args) {
        int[] nums = {6,5,7,8};
        System.out.println(incremovableSubarrayCount(nums));
    }

    public static long incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int leftInd = 0, rightIndex = n-1;
        while(leftInd < n-1 && nums[leftInd] < nums[leftInd + 1]){
            leftInd++;
        }
        
        while(rightIndex > 0 && nums[rightIndex] > nums[rightIndex-1]) rightIndex--;
        
        if(leftInd == n-1) return (n*(n+1))/2;
        
        long ans = n - rightIndex + 1;
        
        for(int i = 0; leftInd >= i; i++){
            
            int j = rightIndex;
            while(j < n && nums[j] <= nums[i]) j++;
            
            ans += (n - j + 1);
            
        }
        
        return ans;
    }
}
