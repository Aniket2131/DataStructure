import java.util.Arrays;

public class Q1846 {
    public static void main(String[] args) {
        
    }

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        arr[0] = 1;
        for(int i = 1; n > i; i++){
            int dif = arr[i] - arr[i-1];
            if(dif > 1){
                arr[i] = arr[i-1]+1;
            }
        }
        return arr[n-1];
    }
}
