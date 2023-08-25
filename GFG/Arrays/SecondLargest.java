public class SecondLargest{
    public static void main(String[] args) {
        int n = 6, arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println(print2largest(arr, n));
    }

    public static int print2largest(int arr[], int n) {
        // code here
        int l = arr[0];
        int s = -1;
        for(int i = 1; n > i; i++){
            if(arr[i] > l){
                s = l;
                l = arr[i];
            }
            else if(arr[i] > s && arr[i] != l){
                s = arr[i];
            }
        }
        return s;
    }
}
