public class minimumDistanceBetweenTwoNumber {
    public static void main(String[] args) {
        
    }

    int minDist(int a[], int n, int x, int y) {
        // code here
        int xi = -1, yi = -1, ans = Integer.MAX_VALUE;
        for(int i = 0; n > i; i++){
            if(a[i] == x || a[i] == y){
                if(a[i] == x){
                    xi = i;
                }
                else{
                    yi = i;
                }
                if(xi != -1 && yi != -1){
                    ans = Math.min(ans, Math.abs(xi-yi));
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1: ans;
    }
}
