import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q100020 {
    public static void main(String[] args) {
        // int[] arr = {69, 121, 47, 96, 38, 90, 30 , 5, 65, 117, 26, 78};
        // System.out.println(xor(26, 4));
        // System.out.println(Arrays.toString(xo(arr)));
        int[][] arr = {{27,94},{61,68},{47,0},{100,4},{127,89},{61,103},{26,4},{51,54},{91,26},{98,23},{80,74},{19,93}};
        System.out.println(countPairs(arr, 95));
    }

    public static int countPairs(int[][] coordinates, int k) {
        int n = coordinates.length;
        int ans = 0;
        HashMap<Integer, Integer> set = new HashMap<>();
        for(int i = 0; n > i; i++){
            int a = coordinates[i][0];
            int b = coordinates[i][1];
            int c = (a ^ b);
            int d = (c^k);
            if(set.containsKey(c^k)){
                // ans += set.get(c^k);
                ans += set.get(c);
                set.put((c^k), set.get(c^k)+1);
                set.put((c), set.get(c)+1);
                // set.put(c, 1);
            }
            else{
                set.put(c, 1);
                set.put((c^k), 1);
            }
        }
        return ans;
    }

    public static int[] xo(int[] arr){
        int n = arr.length;
        int i = 0;
        int[] ans = new int[n];
        for(int el : arr){
            ans[i] = (el ^ 95);
            i++;
        }
        return ans;
    }



    public static int xor(int a, int b){
        return (a^b);
    }
}
