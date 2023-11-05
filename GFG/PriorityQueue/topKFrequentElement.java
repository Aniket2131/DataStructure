import java.util.Arrays;
import java.util.PriorityQueue;

public class topKFrequentElement {
    public static void main(String[] args) {
        
    }

    public int[] topK(int[] nums, int k) {
        // Code here
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> {
            if(a[1] == b[1]) return b[0]-a[0];
            return b[1] - a[1];
        });
        Arrays.sort(nums);
        int i = 0, n = nums.length;
        while(i < n){
            int cnt = 1, num = nums[i++];
            while(i < n && num == nums[i]){
                cnt++;
                i++;
            }
            q.add(new int[]{num, cnt});
        }
        int[] ans = new int[k];
        int j = 0;
        while(k > 0){
            int[] temp = q.poll();
            ans[j] = temp[0];
            j++;
            k--;
        }
        return ans;
    }
}
