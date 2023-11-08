public class Q2849 {
    public static void main(String[] args) {
        
    }
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx == fx && sy == fy && t == 1) return false;
        int a = Math.abs(sx-fx);
        int b = Math.abs(sy-fy);
        int c = Math.max(a, b);
        return c <= t ? true: false;
    }
}
