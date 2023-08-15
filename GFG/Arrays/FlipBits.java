public class FlipBits {
    public static void main(String[] args) {
        int[] a = {1, 0, 0, 1, 0};
        System.out.println(maxOnes(a, a.length));
    }

    public static int maxSum(int arr[], int n){
        int max_sum = arr[0];
        int cur_sum = arr[0];
        for(int i = 1; n > i; i++){
            cur_sum = Math.max(arr[i], cur_sum + arr[i]);
            max_sum = Math.max(cur_sum, max_sum);
        }
        
        return Math.max(0, max_sum);
    }

    public static int maxOnes(int a[], int n) {
        // Your code goes here
        int cnt = 0;
        for(int i = 0; n > i; i++){
            if(a[i] == 0){
                a[i] = 1;
            }
            else{
                a[i] = -1;
                cnt++;
            }
        }
        return cnt + maxSum(a, n);
    }
}
