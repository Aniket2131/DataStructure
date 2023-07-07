import java.util.ArrayList;
import java.util.Collections;

public class leadersInAnArray{
    public static void main(String[] args) {
        int A[] = {16,17,4,3,5,2};
        System.out.println(leaders(A, A.length));
    }

    public static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE; 
        for(int i = n - 1; i >= 0; i--){
            int el = arr[i];
            if(el >= max){
                ans.add(el);
                max = el;
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}