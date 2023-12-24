public class Q1758{
    public static void main(String[] args) {
        
    }

    public static int minOperations(String s) {
        int n = s.length();
        int ans1 = 0;
        int ans2 = 0;
        for(int i = 0; n > i; i++){
            char ch2 = s.charAt(i);

            if(i % 2 == 0){
                if(ch2 != '0') ans1++;
                if(ch2 != '1') ans2++;
            }
            else {
                if(ch2 != '1') ans1++;
                if(ch2 != '0') ans2++;
            }
        }

        return Math.min(ans1, ans2);
    }
}