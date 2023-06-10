package Leetcode.HashTable;

import java.util.HashMap;

public class Q771 {
    public static void main(String[] args) {

    }

    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : jewels.toCharArray()) {
            map.put(ch, 1);
        }
        int ans = 0;
        for (Character ch : stones.toCharArray()) {
            if (map.containsKey(ch)) {
                ans += 1;
            }
        }
        return ans;
    }
}
