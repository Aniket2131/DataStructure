import java.util.ArrayList;
import java.util.List;

public class lettersCollecting {
    public static void main(String[] args) {
        int n = 4, m = 5;
        int[][] mat = {{1, 2, 3, 4, 10}, 
       {5, 6, 7, 8, 10}, 
       {9, 1, 3, 4, 10}, 
       {1, 2, 3, 4, 10}};
        int q = 2;
        int[][] queries = {{1, 0, 1},  {2, 0, 1}}; 
    // int n = 7, m = 6;
    // int[][] mat = {{3, 3, 9, 1, 4, 6},
    //             {4, 8, 3, 7, 3, 5},
    //             {5, 10, 8, 2, 5, 5},
    //             {10, 8, 9, 4, 6, 6},
    //             {2, 6, 10, 8, 6, 3},
    //             {7, 9, 7, 3, 4, 8},
    //             {9, 1, 3, 9 ,1 ,3}};
    // int q = 1;
    // int[][] queries = {{1, 4, 5}};
        System.out.println(matrixSum(n, m, mat, q, queries));
    }

    public static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][]) {
        // code here
        int[] dx1 = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy1 = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] dx2 = {-2, -2, -2, -2, -2, -1, -1, 0, 0, 1, 1, 2, 2, 2, 2, 2};
        int[] dy2 = {-2, -1, 0, 1, 2, -2, 2, -2, 2, -2, 2, -2, -1, 0, 1, 2};
        List<Integer> ans = new ArrayList<>();
        for(int i =0; q > i; i++){
            int st = queries[i][0];
            int s = queries[i][1], e = queries[i][2], sum = 0;

            if(st == 1){
                for(int j = 0; dx1.length > j; j++){
                    int nx = s + dx1[j], ny = e + dy1[j];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                        sum += mat[nx][ny];
                    }
                }
            }
            else{
                for(int j = 0; dx2.length > j; j++){
                    int nx = s + dx2[j], ny = e + dy2[j];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                        sum += mat[nx][ny];
                    }
                }
            }
            
            ans.add(sum);
        }
        return ans;
    }
}