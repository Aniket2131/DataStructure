public class Multiplytwostrings{
    public static void main(String[] args) {
        
    }

    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        int n1 = s1.length();
        int n2 = s2.length();
        int[] arr = new int[n1 + n2];
        int a = s1.charAt(0) == '-' ? -1: 0;
        int b = s2.charAt(0) == '-' ? -1: 0;
        for(int i = n1 - 1; i >= 0; i--){
            int k = i + n2;
            if(s1.charAt(i) != '-'){
                int c = 0;
                for(int j = n2 - 1; j >= 0; j--){
                    if(s2.charAt(j) != '-'){
                        int s = ((s1.charAt(i) - '0') * (s2.charAt(j) - '0')) + c + arr[k]; 
                        arr[k] = s % 10;
                        c = s / 10;
                        k--;
                    }
                }
                if(c > 0){
                    arr[k] = c;
                }
            }
        }
        
        String ans = "";
        if(a < b || b < a) ans+='-';
        boolean f = true;
        for(int i = 0; i < (n1 + n2); i++){
            while(i < n1 + n2 && f == true && arr[i] == 0){
                i++;
            }
            f = false;
            
            ans += arr[i];
        }
        return ans;
    }
}