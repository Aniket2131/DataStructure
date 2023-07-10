import java.util.HashMap;
import java.util.Map;

public class Q70{
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) { 
        Map<Integer, Integer> map = new HashMap<>();
        return climbStairs(n, map);
    }

    public static int climbStairs(int n, Map<Integer, Integer> map){
        if(n == 0 || n == 1) return 1;

        if(!map.containsKey(n)){
            map.put(n, climbStairs(n - 1, map) + climbStairs(n - 2, map));
        }

        return map.get(n);
    }
}