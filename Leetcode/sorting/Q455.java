import java.util.Arrays;

public class Q455 {
    public static void main(String[] args) {
        int[] g = {7, 8, 9, 10}, s = {5, 6, 7, 8};
        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt = 0, si = 0, gi = 0, gn = g.length, sn = s.length;
        while(si < sn && gn > gi){

            if(s[si] >= g[gi]){
                cnt++;
                si++;
                gi++;
            }
            else si++;

        }

        return cnt;
    }
}
