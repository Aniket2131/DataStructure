import java.util.ArrayList;

public class snakePattern {
    public static void main(String[] args) {
        
    }

    static ArrayList<Integer> snakePatter(int matrix[][])
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int n = matrix.length;
        for(int i = 0; n > i; i++){
            int s = ans.size();
            for(int j = 0; j < n; j++){
                if(i % 2 == 0){
                    ans.add(matrix[i][j]);
                }
                else{
                    ans.add(s, matrix[i][j]);
                }
            }
        }
        return ans;
    }
}
