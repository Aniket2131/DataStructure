public class rotateMatrix {
    public static void main(String[] args) {
        
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; n > i; i++){
            for(int j = i; n > j; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; n > i; i++){
            int k = n-1;
            int j = 0;
            while(k >= j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }
        }
    }
}
