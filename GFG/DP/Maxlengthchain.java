import java.util.Arrays;

public class Maxlengthchain {
    class Pair
{
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}
    public static void main(String[] args) {
    }

    public static int maxChainLength(Pair arr[], int n)
    {
       // your code here
        Arrays.sort(arr, (f, s) -> f.y - s.y);
        int max = arr[0].y;
        int ans = 1;
        for(int i = 1; n > i; i++){
            if(arr[i].x > max){
                ans++;
                max = arr[i].y;
            }
        }
        return ans;
    }
}
