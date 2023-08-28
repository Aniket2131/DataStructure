import java.util.ArrayList;
import java.util.List;

public class NextPermutation{
    public static void main(String[] args) {
        int N = 6, arr[] = {1, 2, 3, 6, 5, 4};
        System.out.println(nextPermutation(N, arr));
    }

    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        List<Integer> ans = new ArrayList<>();
        if (arr == null || 1 >= arr.length) {
            return ans;
        }
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[i] >= arr[j]) {
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        reverse(arr, i + 1, arr.length - 1);
        
        for(int el : arr) ans.add(el);
        return ans;
    }
    
    public static void reverse(int[] nums, int i, int j) {
        while (j > i) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}