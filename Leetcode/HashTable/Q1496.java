import java.util.HashSet;
import java.util.Set;

public class Q1496{
    public static void main(String[] args) {
        String path = "NESWW";
        System.out.println(isPathCrossing(path));
    }

    public static boolean isPathCrossing(String path) {
        int[] r = {-1, 1, 0, 0};
        int[] c = {0,  0, -1, 1};
        char[] d = {'N', 'S', 'W', 'E'};
        Set<String> s = new HashSet<>();
        int ro = 0, co = 0;
        s.add("0_0");
        for(char ch: path.toCharArray()){
            int i = 0;
            for(; 4 > i; i++){
                if(d[i] == ch) break;
            }

            ro += r[i];
            co += c[i];
            String st = ro + "" + "_" + co;
            if(s.contains(st)) return true;
            s.add(st);
        }

        return false;
    }
}