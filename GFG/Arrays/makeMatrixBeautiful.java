public class makeMatrixBeautiful {
    public static void main(String[] args) {
        
    }

    public static int findMinOperation(int N, int[][] matrix) {
        // code here
        int maxNum = 0;
        int rmaxSum = 0;
        int cmaxSum = 0;
        for(int i = 0; N > i; i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j = 0; j < N; j++){
                sum1 += matrix[i][j];
                sum2 += matrix[j][i];
                maxNum += matrix[i][j];
            }
            rmaxSum = Math.max(sum1, rmaxSum);
            cmaxSum = Math.max(sum2, cmaxSum);
        }
        
        return Math.max(rmaxSum, cmaxSum) * N - maxNum;
    }
}
