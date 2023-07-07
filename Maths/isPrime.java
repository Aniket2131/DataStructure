import java.util.Arrays;

public class isPrime{
    public static void main(String[] args) {
        System.out.println(prime(12));
    }

    public static Boolean[] prime(int n){
        Boolean[] bool = new Boolean[n + 1];
        Arrays.fill(bool, true);
        bool[0] = false;
        bool[1] = false;
        for(int i = 0; n >= i*i; i++){
            if(bool[i]){
               for(int j = i * 2; n >= j; j++){
                    if(bool[i]) bool[i] = false;
               } 
            }
        }
        return bool;
    }
}