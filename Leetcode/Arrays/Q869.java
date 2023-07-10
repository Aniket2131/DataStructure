public class Q869 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(transpose(matrix));
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for(int i = 0;  matrix.length > i; i++){
            for(int j = 0;matrix[i].length > j; j++){
                ans[j][i] = matrix[i][j];
            }
        }   
           return ans; 
       }
}
