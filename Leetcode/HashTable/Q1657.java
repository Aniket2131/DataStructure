import java.util.Arrays;

public class Q1657 {
    public static void main(String[] args) {
        
    }

    public boolean closeStrings(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        if(n != m) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0; m > i; i++){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            arr1[ch1 - 'a']++;
            arr2[ch2 - 'a']++;
        }

        for(int i = 0; 26 > i; i++){
            if(arr1[i] != 0 && arr2[i] != 0) continue;
            if(arr1[i] == 0 && arr2[i] == 0) continue;

            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; 26 > i; i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
