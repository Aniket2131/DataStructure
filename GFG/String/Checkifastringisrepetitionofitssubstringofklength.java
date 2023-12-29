import java.util.HashMap;

public class Checkifastringisrepetitionofitssubstringofklength{
    public static void main(String[] args) {
        
    }

    int kSubstrConcat(int n, String s, int k)
    {
        // Your Code Here   
        if(n%k!=0) return 0;
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; n > i; i = i + k){
            String st = s.substring(i, i+k);
            map.put(st, map.getOrDefault(st, 0)+1);
        }
        
        int x = map.size();
        if(x==1) return 1;
        if(x==2) for(Integer val : map.values()) if(val==1) return 1;
        return 0;
    }
}