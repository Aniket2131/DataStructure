public class romanToInteger{
    public static void main(String[] args) {
        System.out.println(romanToDecimal("XL"));
    }
    static int[] num = {1, 5, 10, 50, 100, 500, 1000};
    static char[]  roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    public static int romanToDecimal(String str) {
        // code here
        int ans = 0;
        int lstInd = 0;
        for(int i = 0; roman.length > i; i++){
            if(roman[i] == str.charAt(0)){
                ans += num[i];
                lstInd = i;
                break;
            }
        }
        for(int i = 1; str.length() > i; i++){
            char ch = str.charAt(i);
            for(int j = 0; roman.length > j; j++){
                char c = roman[j];
                if(ch == c){
                    if(j > lstInd){
                        ans += num[j];
                        ans -= 2*num[lstInd];
                    }
                    else{
                        ans += num[j];
                    }
                    lstInd = j;
                    break;
                }
            }
        }
        return ans;
    }
}