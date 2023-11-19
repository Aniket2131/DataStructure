public class Q100131 {
    public static void main(String[] args) {
        
    }

    public int findMinimumOperations(String s1, String s2, String s3) {
        int ans = 0, n1 = s1.length(), n2 = s2.length(), n3 = s3.length();
        int i = 0;
        for(i = 0; Math.min(n1, Math.min(n2, n3)) > i; i++){
            char ch1 = s1.charAt(i), ch2 = s2.charAt(i), ch3 = s3.charAt(i);
            if(ch1 != ch2 || ch1 != ch3){
                break;
            }
        }
        int sum = (n1 - i) + (n2 - i) + (n3-i);
        return i == 0 ? -1 : sum;
    }
}
