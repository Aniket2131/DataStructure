public class FindFirstSetBit {
    public static void main(String[] args) {
        System.out.println(getFirstSetBit(18));
    }

    public static int getFirstSetBit(int n){
       
        String nu = Integer.toBinaryString(n & (-n));
        for(int i = nu.length() - 1;  i >= 0; i--){
            if(nu.charAt(i) == '1') return nu.length() - i;
        }
        return 0;
    }
}
