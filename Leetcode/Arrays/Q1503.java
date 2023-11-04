public class Q1503 {
    public static void main(String[] args) {
        int[] left = {4, 3}, right = {0, 1};
        System.out.println(getLastMoment(4, left, right));
    }

    public static int getLastMoment(int n, int[] left, int[] right) {
        int l = left.length, r = right.length;
        if(l == 0 && r == 0) return 0;
        // if(l == 0 || r == 0) return n;
        int t = 0;
        
        while(true){
            t++;
            boolean lef = true, rig = true;
            for(int i = 0; l > i; i++){
                left[i] = left[i]-1;
                if(left[i] >= 0) lef = false;
            }
            for(int i = 0; r > i; i++){
                right[i] = right[i]+1;
                if(right[i] <= n) rig = false;
            }
            if(lef && rig) return t;
        }
    }
}
