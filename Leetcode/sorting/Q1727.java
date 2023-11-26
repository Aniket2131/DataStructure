import java.util.Arrays;
import java.util.Collections;

public class Q1727 {
    public static void main(String[] args) {
        
    }

    public static int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int maxArea = 0;
        for(int i = 0; m > i; i++){

            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 1 && i > 0){
                    matrix[i][j] += matrix[i-1][j]; 
                }
            }
            Integer[] arr = new Integer[n];
            for(int j = 0; n > j; j++){
                arr[j] = matrix[i][j];
            }
            Arrays.sort(arr, Collections.reverseOrder());

            for(int j = 0; n > j; j++){
                int base = j+1;
                int height = arr[j];

                maxArea = Math.max(maxArea, base*height);           
            }
        }
        return maxArea;
    }
}
