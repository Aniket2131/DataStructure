import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumSumCombination{
    public static void main(String[] args) {
        
    }

    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) ->{
            if(a[0] == b[0]) return b[1] - a[1];
            return b[0] - a[0];
        });
        for(int i = 0; N > i; i++){
            q.add(new int[]{A[i] + B[N-1], N-1});
        }
        while(!q.isEmpty() && K > 0){
            int[] num = q.poll();
            ans.add(num[0]);
            if(num[1] > 0){
                q.add(new int[]{num[0] - B[num[1]] + B[num[1]-1], num[1]-1});
            }
            K--;
        }
        return ans;
    }
}