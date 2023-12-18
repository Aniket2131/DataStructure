public class gameOfXOR{
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(gameOfXor(A.length, A));
    }

    public static int gameOfXor(int N , int[] A) {
        // code here
        int ans = 0;
        for(int i = 0; N > i; i++){
            int cnt = ((i + 1) * (N - i))%2;
            // cnt %= 2;
            if(cnt > 0){
                ans ^= A[i];
            }
        }
        return ans;
    }
}