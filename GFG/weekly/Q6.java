public class Q6{
    public static void main(String[] args) {
        // int[] arr = {0, 0, 0, 668238924, 668238785};
        // System.out.println(powerup(arr.length, 668238924, arr));
        int a = 998479513;
        int b = 856796335;
        int c = a+b;
        System.out.println(c);
    }

    public static int powerup(int N, int K, int energyArr[]){
        // Code Here
        int ans = -1;
        int mod = 1000000007;
        for(int i = 0; N > i; i++){
            int left = K%mod;
            boolean flag = false;
            for(int j = i; N > j; j++){
                if(energyArr[j] == 0) left = ((left%mod) + (K%mod))%mod;
                left = ((left%mod) - (energyArr[j]%mod))%mod;
                if(left < 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ans = Math.max(ans, i);
            }
        }
        return ans;
    }
}