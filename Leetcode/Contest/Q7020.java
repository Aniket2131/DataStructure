public class Q7020 {
    public static void main(String[] args) {
        System.out.println(countSymmetricIntegers(1, 100));
    }

    public static int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for(int i = low; high >= i; i++){
            String s = i + "";
            if(s.length() % 2 == 0){
                if(check_sum(s)) ans++;
            }
        }
        return ans;
    }

    public static Boolean check_sum(String s){
        int n = s.length();
        int i = 0;
        int j = n/2;
        int left = 0;
        int right = 0;
        while(i < n / 2){
            int num = Integer.parseInt(s.charAt(i) + "");
            left += num;
            num = Integer.parseInt(s.charAt(j) + "");
            right += num;
            i++;
            j++;
        }
        return left == right;
    }
}
