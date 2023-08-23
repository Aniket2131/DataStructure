import java.util.ArrayList;

public class FindTheStringInGrid {
    public static void main(String[] args) {
        
    }

    public int[][] searchWord(char[][] grid, String word)
    {
        // Code here
        ArrayList<ArrayList<Integer>> lis = new ArrayList<>();
        
        for(int i= 0; grid.length > i; i++){
            for(int j = 0; grid[0].length > j; j++){
                Boolean flag = false;
                if(isRight(i, j, grid, word, 0)) flag = true;
                else if(isLeft(i, j, grid, word, 0)) flag = true;
                else if(isUp(i, j, grid, word, 0)) flag = true;
                else if(isDown(i, j, grid, word, 0)) flag = true;
                else if(isUpRight(i, j, grid, word, 0)) flag = true;
                else if(isUpLeft(i, j, grid, word, 0)) flag = true;
                else if(isDownRight(i, j, grid, word, 0)) flag = true;
                else if(isDownLeft(i, j, grid, word, 0)) flag = true;
                if(flag){
                    ArrayList<Integer> li = new ArrayList<>();
                    li.add(i);
                    li.add(j);
                    lis.add(li);
                }
            }
        }
        int[][] ans = new int[lis.size()][2];
        for(int i = 0; lis.size() > i; i++){
            ans[i][0] = lis.get(i).get(0);
            ans[i][1] = lis.get(i).get(1);
        }
        return ans;
    }
    
    public Boolean isPossible(int i , int j, char[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        if(i < 0 || j < 0 || i >= n || j >= m) return false;
        return true;
    }
    
    public Boolean isRight(int i,int j, char[][] grid, String word, int ind){
        if(grid[i][j] == word.charAt(ind)){
            if(ind == word.length() - 1) return true;
            if(isPossible(i, j+1, grid)){
                return isRight(i, j+1, grid, word, ind+1);
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    public Boolean isLeft(int i,int j, char[][] grid, String word, int ind){
        if(grid[i][j] == word.charAt(ind)){
            if(ind == word.length() - 1) return true;
            if(isPossible(i, j-1, grid)){
                return isLeft(i, j-1, grid, word, ind+1);
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    public Boolean isUp(int i,int j, char[][] grid, String word, int ind){
        if(grid[i][j] == word.charAt(ind)){
            if(ind == word.length() - 1) return true;
            if(isPossible(i-1, j, grid)){
                return isUp(i-1, j, grid, word, ind+1);
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    public Boolean isDown(int i,int j, char[][] grid, String word, int ind){
        if(grid[i][j] == word.charAt(ind)){
            if(ind == word.length() - 1) return true;
            if(isPossible(i+1, j, grid)){
                return isDown(i+1, j, grid, word, ind+1);
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    public Boolean isUpRight(int i,int j, char[][] grid, String word, int ind){
        if(grid[i][j] == word.charAt(ind)){
            if(ind == word.length() - 1) return true;
            if(isPossible(i - 1, j+1, grid)){
                return isUpRight(i - 1, j+1, grid, word, ind+1);
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    public Boolean isUpLeft(int i,int j, char[][] grid, String word, int ind){
        if(grid[i][j] == word.charAt(ind)){
            if(ind == word.length() - 1) return true;
            if(isPossible(i-1, j-1, grid)){
                return isUpLeft(i-1, j-1, grid, word, ind+1);
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    public Boolean isDownRight(int i,int j, char[][] grid, String word, int ind){
        if(grid[i][j] == word.charAt(ind)){
            if(ind == word.length() - 1) return true;
            if(isPossible(i+1, j+1, grid)){
                return isDownRight(i+1, j+1, grid, word, ind+1);
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    public Boolean isDownLeft(int i,int j, char[][] grid, String word, int ind){
        if(grid[i][j] == word.charAt(ind)){
            if(ind == word.length() - 1) return true;
            if(isPossible(i+1, j-1, grid)){
                return isDownLeft(i+1, j-1, grid, word, ind+1);
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
