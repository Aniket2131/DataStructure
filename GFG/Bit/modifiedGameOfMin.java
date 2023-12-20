public class modifiedGameOfMin {
    public static void main(String[] args) {
        
    }

    static int findWinner(int n, int A[]){
        // code here
        if(n % 2 == 0) return 1;
        
        int x = 0;
        for(int el : A) x ^= el;
        
        return x == 0 ? 1: 2;
    }
}
