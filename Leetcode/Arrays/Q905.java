public class Q905 {
    public static void main(String[] args) {
        
    }

    public int[] sortArrayByParity(int[] nums) {
        int i = 0; 
        int j = nums.length - 1;
        while(j > i){
            while(i < j && (nums[i] & 1) == 0) i++;
            while(j > i && (nums[j] & 1) == 1) j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
}
