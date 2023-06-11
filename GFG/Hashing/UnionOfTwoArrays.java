// Expected Time Complexity : O(n+m)
// Expected Auxilliary Space : O(n+m)

import java.util.HashMap;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 5, 4 };
        int[] arr2 = { 1, 2, 3 };
        System.out.println(doUnion(arr1, 5, arr2, 3));
    }

    public static int doUnion(int a[], int n, int b[], int m) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer el : a) {
            map.put(el, 1);
        }
        for (Integer el : b) {
            map.put(el, 1);
        }
        return map.size();
    }
}
