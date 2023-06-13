import java.util.PriorityQueue;

public class kLargestElements {
    public static void main(String[] args) {
        int[] arr = { 12, 5, 787, 1, 23 };
        System.out.println(kLargest(arr, 5, 2));
    }

    public static int[] kLargest(int[] arr, int n, int k) {
        // code here
        int[] ans = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Integer i : arr) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        for (int i = pq.size() - 1; i >= 0; i--) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}