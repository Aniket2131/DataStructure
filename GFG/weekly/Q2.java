public class Q2{
    public static void main(String[] args) {
        String s = "11001100";
        System.out.println(flipCoins(8, s));
    }

    public static String flipCoins(int N,String s) {
        // Code here
        StringBuilder st = new StringBuilder();
        st.append(s);
        
        for(int i = 0; N - 1 > i; i++){
            if(st.charAt(i) == '0'){
                st.setCharAt(i, '1');
                if(st.charAt(i + 1) == '1'){
                    st.setCharAt(i+1, '0');
                }
                else{
                    st.setCharAt(i+1, '1');
                }
            }
        }
        for(int i = 0; N > i; i++){
            if(st.charAt(i) == '0') return "No";
        }
        return "Yes";
    }
}