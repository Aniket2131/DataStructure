public class MostVotingAlgo {
    public static void main(String[] args) {
        
    }

    public int majorityElement(int[] nums) {
        int cnt = 0;
        int major = 0;
        for(int el : nums){
            if(cnt == 0){
                major = el;
            }
            if(el == major){
                cnt++;
            }
            else{
                cnt -= 1;
            }
        }
        return major;
    }
}
