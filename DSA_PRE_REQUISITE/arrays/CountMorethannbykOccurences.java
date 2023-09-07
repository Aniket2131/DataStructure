import java.util.HashMap;

public class CountMorethannbykOccurences{
    public static void main(String[] args) {
        
    }

    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        HashMap<Integer, Integer> map = new HashMap<>();
        int f = n/k;
        int ans = 0;
        for(int el : arr){
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        for(int el : map.keySet()){
            if(map.get(el) > f) ans++;
        }
        return ans;
    }
}