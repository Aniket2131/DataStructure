public class Q136{
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int NotRepetive = 0;
        for (int i : nums) {
            NotRepetive ^= i;
        }
        
        return NotRepetive;
    }
}