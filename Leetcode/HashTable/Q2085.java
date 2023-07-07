import java.util.HashMap;
import java.util.Map;

public class Q2085{
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"}, words2 = {"amazing","leetcode","is"};
        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(String el : words1){
            map1.put(el, map1.getOrDefault(el, 0) + 1);
        }
        for(String el : words2){
            map2.put(el, map2.getOrDefault(el, 0) + 1);
        }
        int ans = 0;
        for(String st : map1.keySet()){
            if(map2.containsKey(st) && map1.get(st) == 1 && map2.get(st) == 1) ans++;
        }
        return ans;
    }
}