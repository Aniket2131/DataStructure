public class frequencyOfLimitedRange {
    public static void main(String[] args) {
        
    }

    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int[] fr = new int[N];
        for(int el : arr){
            if(el <= N){
                fr[el-1]++;
            }
        }
        for(int i = 0; N > i; i++){
            arr[i] = fr[i];
        }
    }
}
