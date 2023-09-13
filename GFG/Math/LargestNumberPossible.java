public class LargestNumberPossible {
    public static void main(String[] args) {
        
    }

    static String findLargest(int N, int S){
        // code here
        if(S == 0 && N > 1) return "-1";
        StringBuilder ans = new StringBuilder();
        for(int i = 0; N > i; i++){
            if(S >= 9){
                ans.append('9');
                S -= 9;
            }
            else{
                ans.append((char)(S + 48));
                S = 0;
            }
        }
        return S != 0 ? "-1" :ans.toString();
    }
}
