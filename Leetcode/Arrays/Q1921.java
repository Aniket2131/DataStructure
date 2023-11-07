import java.util.Arrays;

public class Q1921 {
    public static void main(String[] args) {
        int[] dist = {3,5,7,4,5}, speed = {2,3,6,3,2};
        System.out.println(eliminateMaximum(dist, speed));
    }

    public static int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        double[] arr = new double[n];
        for(int i = 0; n > i; i++){
            arr[i] = (dist[i]*1.0)/(speed[i]*1.0);
        }
        Arrays.sort(arr);
        int i;
        for(i = 1; n > i; i++){
            if(arr[i] <= i) break;
        }
        return i;
    }
}
