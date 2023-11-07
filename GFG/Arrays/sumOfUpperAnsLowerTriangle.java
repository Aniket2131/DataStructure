import java.util.ArrayList;

public class sumOfUpperAnsLowerTriangle {
    public static void main(String[] args) {
        
    }

    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int sum1 =0, sum2 = 0;
        for(int i = 0; n > i; i++){
            for(int j = 0; n > j; j++){
                // int el = matrix[i][j];
                if(i == j){
                    sum1 += matrix[i][j];
                    sum2 += matrix[i][j];
                }
                else if(i > j){
                    sum2 += matrix[i][j];
                }
                else{
                    sum1 += matrix[i][j];
                }
            }
        }
        ans.add(sum1);
        ans.add(sum2);
        return ans;
    }
}
