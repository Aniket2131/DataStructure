import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class shortestPathPrime {
    public static void main(String[] args) {
        System.out.println(solve(1033, 8179));
    }

    public static int solve(int num1,int num2){
        //code here
        boolean[] prime = new boolean[10004];
        getPrime(prime);

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{num1, 0});

        while(!q.isEmpty()){
            int[] temp = q.poll();
            int n = temp[0], d = temp[1];
            if(n == num2) return d;
            
            String s = n + "";
            for(int i = 0; 4 > i; i++){
                int ch = Integer.parseInt(s.charAt(i)+"");
                int left = 9 - ch;
                for(int j = 0; j < 9; j++){
                    int mul = (int) (Math.pow(10, 3-i) * (j+1));
                    if(j >= left){
                        int num = n - (int) (Math.pow(10, 3-i) * (9-j));
                        if(num >= 1000 && prime[num]) q.add(new int[]{num, d+1});
                    }
                    else{
                        int num = n + mul;
                        if(prime[num]) q.add(new int[]{num, d+1});
                    }
                }
            }
        }
        return -1;
    }
    public static void getPrime(boolean[] prime){
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        int n = prime.length-1;
        for(int i  = 0; i*i <= n; i++){

            if(prime[i]){
                for(int j = i*i; j <= n; j += i){
                    if(prime[j]) prime[j] = false;
                }
            }
        }
    } 
}
