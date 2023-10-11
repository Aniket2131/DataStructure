import java.util.Arrays;

public class Q2251 {
    public static void main(String[] args) {
        
    }

    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int p = people.length;
        int f = flowers.length;
        int[] ans = new int[p];
        int[] st = new int[f];
        int[] ed = new int[f];
        for(int i = 0; f > i; i++){
            st[i] = flowers[i][0];
            ed[i] = flowers[i][1];
        }
        Arrays.sort(st);
        Arrays.sort(ed);

        for(int i = 0; p > i; i++){
            int trg = people[i];
            int up = upForStart(st, trg);
            int lb = LBlessthan(ed, trg);

            ans[i] = up - lb;
        }
        return ans;
    }

    public int upForStart(int[] f, int trg){
        int s = 0;
        int e = f.length-1;
        while(e >= s){
            int m = s + (e - s)/2;
            if(f[m] > trg){
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        return s;
    }

    public int LBlessthan(int[] f, int trg){
        int s = 0;
        int e = f.length-1;
        while(e >= s){
            int m = s + (e - s)/2;
            if(f[m] >= trg){
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        return s;
    }
}
