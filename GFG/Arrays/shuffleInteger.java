import java.util.Arrays;

public class shuffleInteger {
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // long[] arr = {1, 2, 9, 15};
        shuffleArray(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void shuffleArray(long arr[], int n)
    {
        // Your code goes here
        int x = 10000;
        for(int i = 0; n/2 > i; i++){
            arr[i] = arr[i]+arr[n/2+i]*x;
        }
        int j = n-1;
        for(int i = n/2-1; i >= 0; i--){
            arr[j] = arr[i]/x;
            arr[j-1] = arr[i]%x;
            j -= 2;
        }
    }

    
}
