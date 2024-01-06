public class TechFestAndQueue{
    public static void main(String[] args) {
        long a = 9, b = 12;

        System.out.println(sumOfPowers(a, b));
    }

    public static long sumOfPowers(long a, long b) {
        // code here
        boolean[] prime = new boolean[(int)(b+1)];
        prime[0] = true;
        prime[1] = true;
        for(int i = 2; i <= b; i++){
            
            if(!prime[i]){
                
                for(int j = 2; (j*i) <= b; j++){
                    
                    if(!prime[j*i]) prime[j*i] = true;
                    
                }
                
            }
        }
        
        long ans = 0;
        
        for(long i = a; i <= b; i++){
            
            long sum = 0;
            if(!prime[(int)(i)]) sum++;
            else{
                int k = (int)i;
                while(k > 1){
                    if(!prime[k]){
                        sum++;
                        break;
                    }
                    for(int j = 2; j <= k; j++){
                        
                        if(k % j == 0){
                            if(!prime[j]) sum++;
                            k /= j;
                            break;
                        }
                        
                    }
                    
                }
            }
            
            ans += sum;
        }
        
        return ans;
    }
}