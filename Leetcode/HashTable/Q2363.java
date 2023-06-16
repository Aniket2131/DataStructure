import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2363 {
    public static void main(String[] args) {
        int[][] items1 = {
                { 1, 1 },
                { 4, 5 },
                { 3, 8 },
        };
        int[][] items2 = {
                { 3, 1 },
                { 1, 5 },
        };
        System.out.println(mergeSimilarItems(items1, items2));
    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = new int[1003];
        for (int i = 0; items1.length > i; i++) {
            arr[items1[i][0]] += items1[i][1];
        }
        for (int i = 0; items2.length > i; i++) {
            arr[items2[i][0]] += items2[i][1];
        }
        for (int i = 0; arr.length > i; i++) {
            if (arr[i] > 0) {
                ArrayList<Integer> innerArray = new ArrayList<>();
                innerArray.add(0, i);
                innerArray.add(1, arr[i]);
                ans.add(innerArray);
            }
        }
        return ans;
    }
}
