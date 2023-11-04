public class transaction {
    public static void main(String[] args) {
        
    }

    int transitionPoint(int arr[], int n) {
        // code here
        int s = 0, e = n-1;
        while(e >= s){
            int m = s + (e - s)/2;
            if(arr[m] == 0){
                s = m + 1;
            }
            else{
                e = m-1;
            }
        }
        return s >= n ? -1: s;
    }
}
