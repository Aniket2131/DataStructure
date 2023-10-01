public class allocateMinimumNumberOfPages {
    public static void main(String[] args) {
        
    }

    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(A.length < M) return -1;
        int l = Integer.MIN_VALUE, h = 0;
        for(int el : A){
            h += el;
            l = Math.max(el, l);
        }
        if(M == 1) return h;
    
        while(h >= l){
            int mid = l + (h - l)/2;
            int cnt = possible(A, mid, M);
            if(cnt <= M){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }
    
    public static int possible(int[] A, int mid, int M){
        int cnt = 1;
        int sum = 0;
        for(int i = 0; A.length > i; i++){
            if(sum + A[i] <= mid){
                sum += A[i];
            }
            else{
                cnt++;
                sum = A[i];
            }
        }
        
        return cnt;
    }
}
