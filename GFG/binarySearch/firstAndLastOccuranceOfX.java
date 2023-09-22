import java.util.ArrayList;

public class firstAndLastOccuranceOfX {
    public static void main(String[] args) {
        int n=7, x=8;
        int arr[] = { 5, 7, 7, 7, 8, 8, 8};
        System.out.println(find(arr, n-1, x));
    }

    public static ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        int s = leftOccurance(arr, 0, n, x);
        int ind = rightOccurance(arr, 0, n, x);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(s);
        ans.add(ind);
        return ans;
    }
    
    public static int leftOccurance(int[] arr, int s, int n, int x){
        int ind = -1;
        while(n >= s){
            int m =  s + (n - s)/2;
            if(arr[m] == x){
                ind = m;
                n = m - 1;
            }
            else if(arr[m] > x){
                n = m - 1;
            }
            else{
                s = m+1;
            }
        }
        return ind;
    }
    
    public static int rightOccurance(int[] arr, int s, int n, int x){
        int ind = -1;
        while(n >= s){
            int m =  s + (n - s)/2;
            if(arr[m] == x){
                ind = m;
                s = m + 1;
            }
            else if(arr[m] > x){
                n = m - 1;
            }
            else{
                s = m+1;
            }
        }
        return ind;
    }
}
