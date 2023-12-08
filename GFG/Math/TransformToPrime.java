import java.util.Arrays;

public class TransformToPrime {
    public static void main(String[] args) {
        
    }

    public int minNumber(int arr[], int N)
    {
        boolean[] prime = new boolean[1000003];
        Arrays.fill(prime, true);
        
        int sum = 0;
        for(int el : arr) sum += el;
        
        prime[0] = false;
        prime[1] = false;
        
        for(int i = 2; i * i < 1000003; i++){
            
            if(prime[i]){
                
                for(int j = i * i; j < 1000003; j += i){
                    
                    prime[j] = false;
                    
                }
                
            }
            
        }
        
        int l = sum, h = 1000003;
        
        if(prime[l]) return 0;
        
        for(int i = l; i < h; i++){
            if(prime[i]) return i - l;
        }
        return -1;
    }
}
