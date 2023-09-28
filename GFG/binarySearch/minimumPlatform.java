import java.util.Arrays;

public class minimumPlatform {
    public static void main(String[] args) {
        int n = 6; 
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr, dep, n));
    }

    public static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        int max = 1;
        int plt = 1;
        int i = 1;
        int j = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        while(i < n){
            while(j < n && dep[j] < arr[i]){
                plt--;
                j++;
            }
            plt++;
            i++;
            max = Math.max(max, plt);
        }
        return max;
        
    }
}
