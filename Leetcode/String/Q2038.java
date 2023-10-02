public class Q2038 {
    public static void main(String[] args) {
        String color = "BAABABBAAA";
        // String color = "AA";
        System.out.println(winnerOfGame(color));
    }

    public static boolean winnerOfGame(String colors) {
        int n = colors.length();
        int A = 0;
        int i = 0;
        while(i < n){
            if(colors.charAt(i) == 'A'){
                int j = i + 1;
                while(j < n && colors.charAt(j) == 'A'){
                    j++;
                }
                if(j - i - 2 > 0){
                    A += j - i - 2;
                }
                i = j;
            }
            else{
                i++;
            }
        }
        int B = 0;
        i = 0;
        while(i < n){
            if(colors.charAt(i) == 'B'){
                int j = i + 1;
                while(j < n && colors.charAt(j) == 'B'){
                    j++;
                }
                if(j - i - 2 > 0){
                    B += j - i - 2;
                }
                i = j;
            }
            else{
                i++;
            }
        }
        // if(A < 0) A = 0;
        // if(B < 0) B = 0;
        if( A == B) return false;
        return A > B;
    }
}
