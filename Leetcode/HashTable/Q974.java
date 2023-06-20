public class Q974 {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 0, -2, -3, 1 };
        System.out.println(subarraysDivByK(nums, 5));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int[] remArr = new int[k];
        int ans = 0;
        int rem = 0;
        int sum = 0;
        remArr[0] = 1;
        for (int i = 0; nums.length > i; i++) {
            sum += nums[i];
            rem = sum % k;
            if (0 > rem)
                rem += k;
            if (remArr[rem] > 0) {
                ans += remArr[rem];
            }
            remArr[rem]++;
        }
        return ans;
    }
}