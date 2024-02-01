public class panagramString {
    public static void main(String[] args) {
        
    }

    public static boolean checkPangram  (String s) {
        // your code here
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            if(ch - 'a' >= 0){
                arr[ch-'a']++;
            }
            else if(ch-'a' + 32 >= 0){
                arr[ch-'a'+32]++;
            }
        }

        for(int i = 0; 26 > i; i++){
            if(arr[i] == 0) return false;
        }
        return true;
    }
}
