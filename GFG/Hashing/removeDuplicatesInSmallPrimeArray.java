import java.util.ArrayList;

public class removeDuplicatesInSmallPrimeArray {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 3, 7, 5 };
        System.out.println(removeDuplicate(arr, 6));
    }

    public static ArrayList<Integer> removeDuplicate(int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int el : arr) {
            if (!ans.contains(el)) {
                ans.add(el);
            }
        }
        return ans;
    }
}
