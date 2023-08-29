public class Q2483 {
    public static void main(String[] args) {
        String customers = "NYNNNYYN";
        System.out.println(bestClosingTime(customers));
    }

    public static int bestClosingTime(String customers) {
        int n = customers.length();
        int[] p = new int[n + 1];
        int nCnt = 0;
        if(customers.charAt(0) == 'N') nCnt = 1;
        for(int i = 1; n > i; i++){
            p[i] = nCnt;
            if(customers.charAt(i) == 'N') nCnt++;
        }
        p[n] = p[n - 1];

        int[] s = new int[n + 1];
        s[n] = 0;
        for(int i = n - 1; i >= 0; i--){
            if(customers.charAt(i) == 'Y') s[i] = 1 + s[i + 1];
            else s[i] = s[i + 1];
        }
        int ans = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; n >= i; i++){
            int sum = s[i] + p[i];
            if(min > sum){
                min = sum;
                ans = i;
            }
        }
        return ans;
    }
}
