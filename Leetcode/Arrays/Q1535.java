import java.util.LinkedList;
import java.util.Queue;

public class Q1535{
    public static void main(String[] args) {
        
    }

    public int getWinner(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        int max = -1;
        for(int el : arr){
            q.add(el);
            max = Math.max(max, el);
        }
        if(k >= arr.length) return max;
        int num = q.poll();
        int cnt = 0;
        while(true){
            while(q.peek() < num){
                cnt++;
                if(cnt >= k) return num;
                int n = q.poll();
                q.add(n);
            }
            if(cnt >= k){
                return num;
            }
            q.add(num);
            num = q.poll();
            cnt = 1;
        }
    }
}