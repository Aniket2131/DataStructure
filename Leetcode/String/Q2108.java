public class Q2108{
    public static void main(String[] args) {
        
    }

    public String firstPalindrome(String[] words) {
        String ans = "";

        for(String st: words){
            int i = 0, j = st.length()-1;
            boolean f = true;
            while(j >= i){
                char ch1 = st.charAt(i), ch2 = st.charAt(j);
                if(ch1 == ch2){
                    i++;
                    j--;
                }
                else{
                    f = false;
                    break;
                }
            }
            if(f){
                ans = st;
                break;
            }
        }
        return ans;
    }
}