import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumMultiplicationstoreachEnd{
    public static void main(String[] args) {
        
    }

    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        Queue<Pair> q = new LinkedList<>();
        if(start == end) return 0;
        q.add(new Pair(start, 0));
        int[] temp = new int[100000];
        Arrays.fill(temp, 1000000007);
        int mod = 100000;
        temp[start] = 0;
        while(!q.isEmpty()){
            int num = q.peek().first;
            int level = q.peek().second;
            q.poll();
            for(int el : arr){
                int mul = (el * num)%mod;
                if(level + 1 < temp[mul]){
                    temp[mul] = level + 1;
                    if(mul == end) return level + 1;
                    q.add(new Pair(mul, level + 1));
                }
            }
        }
        return -1;
    }
}

class Pair{
    int first;
    int second;
    
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}