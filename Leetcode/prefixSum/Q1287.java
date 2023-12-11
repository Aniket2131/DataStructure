public class Q1287{
    public static void main(String[] args) {
        
    }

    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];
        
        int s = n/4 + 1;
        
        int ans = -1, num = arr[0], cnt = 1;
        for(int i = 1; n > i; i++){
            
            if(num == arr[i]){
                cnt++;
            }
            else{
                cnt = 1;
                num = arr[i];
            }
            
            if(cnt >= s){
                ans = num;
                break;
            }
        }
        
        return ans;
    }
}