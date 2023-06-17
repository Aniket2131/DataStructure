import java.util.stream.IntStream;

public class Q2206 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 2, 2, 2 };
        System.out.println(divideArray(nums));
    }

    public static boolean divideArray(int[] nums) {
        int[] cnt = new int[501];
        for (int n : nums)
            ++cnt[n];
        return IntStream.of(cnt).allMatch(n -> n % 2 == 0);
    }
}
