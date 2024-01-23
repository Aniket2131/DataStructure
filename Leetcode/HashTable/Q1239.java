import java.util.ArrayList;
import java.util.List;

public class Q1239{
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("un");
        arr.add("iq");
        arr.add("ue");
        System.out.println(maxLength(arr));
    }

    static int ans;
    public static int maxLength(List<String> arr) {
        ans = Integer.MIN_VALUE;
        solve(0, new int[26], arr);
        return ans;
    }

    public static void solve(int ind, int[] arr, List<String> s){
        if(ind == s.size()){
            int num = count(arr);
            if(num > ans) ans = num;
            return;
        }

        if(check(s.get(ind), arr)){
            add(arr, s.get(ind));
            solve(ind+1, arr, s);
            remove(arr, s.get(ind));
        }

        solve(ind+1, arr, s);
    }

    public static void add(int[] arr, String s){
        for(char ch: s.toCharArray()) arr[ch - 'a']++;
    }

    public static void remove(int[] arr, String s){
        for(char ch: s.toCharArray()) arr[ch - 'a']--;
    }

    public static int count(int[] arr){
        int num = 0;
        for(int i = 0; 26 > i; i++){
            if(arr[i] > 0) num++;
        }
        return num;
    }

    public static boolean check(String s, int[] arr){
        int[] cur = new int[26];
        for(char ch: s.toCharArray()){
            if(arr[ch - 'a'] > 0 || cur[ch - 'a'] > 0) return false;
            else cur[ch - 'a']++;
        }
        return true;
    }
}