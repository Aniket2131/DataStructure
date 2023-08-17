import java.util.Vector;

public class NextSmallestPalindrome {
    public static void main(String[] args) {
        int N = 11, Num[] = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2};
        System.out.println(generateNextPalindrome(Num, N));
    }

    public static Vector<Integer> generateNextPalindrome(int num[], int n) {
        // code here
        if(allNine(num, n)){
            Vector<Integer> ans = new Vector<>();
            ans.add(1);
            for(int i = 0; n - 1 > i; i++){
                ans.add(0);
            }
            ans.add(1);
            return ans;
        }
        else if((n & 1) == 1){
            Boolean f = false;
            for(int i = 0; n / 2 > i; i++){
                if(num[i] > num[n - i - 1]){
                    f = true;
                }
                else if(num[i] == num[n - i - 1]){
                    continue;
                }
                else{
                    f = false;
                }
                num[n - i - 1] = num[i]; 
            }
            if(!f){
                int j = 0;
                for(; n /2 - 1 > j; j++){
                    if(num[n / 2 - j] == 9){
                        num[n / 2 - j] = 0;
                        num[n / 2 + j] = 0;
                    }
                    else{
                        break;
                    }
                }
                if(j == 0){
                    num[n / 2 - j]++;
                }
                else{
                    num[n/2 - j]++;
                    num[n/2 + j]++;
                }
            }
        }
        else{
            Boolean f = false;
            for(int i = 0; n / 2 > i; i++){
                if(num[i] > num[n - i - 1]){
                    f = true;
                }
                else if(num[i] == num[n - i - 1]){
                    continue;
                }
                else{
                    f = false;
                }
                num[n - i - 1] = num[i]; 
            }
            if(!f){
                int j = 0;
                for(; n /2 - 1 > j; j++){
                    if(num[n / 2 - j - 1] == 9){
                        num[n / 2 - j - 1] = 0;
                        num[n / 2 + j] = 0;
                    }
                    else{
                        break;
                    }
                }
                num[n/2 - j - 1]++;
                num[n/2 + j]++;
                
            }
        }
        Vector<Integer> ans = new Vector<>();
        for(int i = 0; n > i; i++){
            ans.add(num[i]);
        }
        return ans;
    }
    
    public static Boolean allNine(int[] num, int n){
        for(int i = 0; n > i; i++){
            if(num[i] != 9){
                return false;
            }
        }
        return true;
    }
}
