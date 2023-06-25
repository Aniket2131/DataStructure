public class Q6471 {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 4 };
        // int[] nums = { 31, 25, 72, 79, 74 };
        System.out.println(countBeautifulPairs(nums));
    }

    public static int countBeautifulPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; nums.length > i; i++) {
            for (int j = i + 1; nums.length > j; j++) {
                int a = (nums[i] + "").toString().charAt(0) - '0';
                int b = nums[j] % 10;
                while (b != 0) {
                    if (a > b) {
                        a = a - b;
                    } else {
                        b = b - a;
                    }
                }
                if (a == 1)
                    ans++;
            }
        }
        return ans;
    }

}