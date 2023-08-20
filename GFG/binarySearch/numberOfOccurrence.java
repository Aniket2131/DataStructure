public class numberOfOccurrence{
    public static void main(String[] args) {
        int N = 7, X = 2;
        int Arr[] = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(count(Arr, N, X));
    }

    static int l;
    static int r;
    public static int count(int[] arr, int n, int x) {
        // code here
        l = leftBinarySearch(arr, 0, arr.length - 1, x);
        r = rightBinarySearch(arr, 0, arr.length - 1, x);
        if(l == -1 && r == -1) return 0;
        return r - l + 1;
    }
    
    public static int leftBinarySearch(int[] arr, int l, int h, int tar){
        int m = l + (h - l)/2;
        int ans = -1;
        while(l <= h){
            if(arr[m] == tar){
                ans = m;
                h = m - 1;
            }
            else if(arr[m] > tar){
                h = m - 1;
            }
            else{
                l = m + 1;
            }
            m = l + (h - l)/2;
        }
        return ans;
    }
    public static int rightBinarySearch(int[] arr, int l, int h, int tar){
        int m = l + (h - l)/2;
        int ans = -1;
        while(l <= h){
            if(arr[m] == tar){
                ans = m;
                l = m + 1;
            }
            else if(arr[m] > tar){
                h = m - 1;
            }
            else{
                l = m + 1;
            }
            m = l + (h - l)/2;
        }
        return ans;
    }
}