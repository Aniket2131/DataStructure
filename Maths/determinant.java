public class determinant{

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 2, -1},
            {3, 0, 0, 5},
            {2, 1, 4, -3},
            {1, 0, 5, 0}
        };

        // int matrix[][] = {{1, 2, 3},
        // {4, 5, 6},
        // {7, 10, 9}};


        System.out.println(determinantOfMatrix(matrix, matrix.length));
    }

    static int determinantOfMatrix(int matrix[][], int n)
    {
        // code here 
        if(n == 1) return matrix[0][0];
        
        if(n == 2) return matrix[0][0]*matrix[1][1] - matrix[1][0]*matrix[0][1];
        int ans = 0;
        
        for(int i = 0; n > i; i++){
            
            int co = (int)Math.pow(-1, i) * matrix[0][i] * determinantOfMatrix(sub(matrix, 0, i), n-1);
            ans += co;
        }
        
        return ans;
    }
    
    static int[][] sub(int[][] mat,  int r, int c){
        
        int n = mat.length;
        int ro = 0, co = 0;
        int[][] ans = new int[n-1][n-1];
        
        
        for(int i = 0; n > i; i++){
            
            if(i != r){
                
                for(int j = 0; n > j; j++){
                    
                    if(j != c){
                        ans[ro][co++] = mat[i][j];
                    }
                    
                }
                
                co = 0;
                ro++;
            }
            
        }
        
        return ans;
    }

}