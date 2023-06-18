import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class secondMostRepeatedStringInASequence {
    public static void main(String[] args) {
        String arr[] = { "aaa", "bbb", "ccc", "bbb", "aaa", "aaa" };
        System.out.println(secFrequent(arr, arr.length));
    }

    public static String secFrequent(String arr[], int N) {
        // your code here
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> {
            return a.getValue() - b.getValue();
        });
        for (String el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        for (Map.Entry<String, Integer> el : map.entrySet()) {
            pq.add(el);
        }
        while (pq.size() > 2) {
            pq.poll();
        }
        return pq.size() == 1 ? "" : pq.poll().getKey();
    }
}
