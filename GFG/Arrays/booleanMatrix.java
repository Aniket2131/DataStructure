public class booleanMatrix{
    public static void main(String[] args) {
        
    }

    void booleanMatri(int matrix[][])
    {
        // code here 
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; n > i; i++){
            for(int j = 0; m > j; j++){
                if(matrix[i][j] != 1) continue;
                if(matrix[i][j] == 1){
                    up(i, j, matrix);
                    left(i,  j, matrix);
                }
            }
        }
        
        for(int i = 0; n > i; i++){
            for(int j = 0; m > j; j++){
                if(matrix[i][j] != 2) continue;
                if(matrix[i][j] == 2) matrix[i][j] = 1;
            }
        }
    }
    
    
    void up(int r, int c, int[][] matrix){
        for(int i = 0; matrix.length > i; i++){
            if(matrix[i][c] != 0) continue;
            if(matrix[i][c] == 0){
                matrix[i][c] = 2;
            }
        }
    }
    
    void left(int r, int c, int[][] matrix){
        for(int i = 0; matrix[0].length > i; i++){
            if(matrix[r][i] != 0) continue;
            if(matrix[r][i] == 0){
                matrix[r][i] = 2;
            }
        }
    }
}