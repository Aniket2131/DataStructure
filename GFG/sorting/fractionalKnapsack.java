import java.util.Arrays;

public class fractionalKnapsack{
    public static void main(String[] args) {
        
    }

    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr, (a, b) -> Double.compare(b.value*1.0/b.weight, a.value*1.0/a.weight));
        
        int wt = 0;
        double ans = 0.0;
        
        for(int i = 0; n > i; i++){
            if(W == wt) break;
            
            int temp = arr[i].weight;
            if(temp <= W-wt){
                ans += arr[i].value;
                wt += temp;
            }
            else{
                ans += (W-wt)*(arr[i].value*1.0/temp);
                wt = W;
            }
        }
        return ans;
    }

    class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
    }
}