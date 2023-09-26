import java.util.ArrayList;
import java.util.Arrays;

public class findAll4Sum{
    public static void main(String[] args) {
        
    }

    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
      
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; n > i; i++){
            if(i != 0 && arr[i] == arr[i-1]) continue;
            for(int j = i+1; j < n; j++){
                if(j != i+1 && arr[j] == arr[j-1]) continue;    
                
                int s = j + 1, e = n-1;
                while(e > s){
                    int num = arr[s] + arr[i] + arr[j] + arr[e];
                    if(num == k){
                        ArrayList<Integer> li = new ArrayList<>();
                        li.add(arr[i]);
                        li.add(arr[j]);
                        li.add(arr[s]);
                        li.add(arr[e]);
                        ans.add(li);
                        s++;
                        e--;
                        while(s < e && arr[s] == arr[s-1]) s++;
                        while(s < e && arr[e] == arr[e+1]) e--;
                    }
                    else if(num < k) s++;
                    else e--;
                }
            }
        }
        return ans;
    }
}