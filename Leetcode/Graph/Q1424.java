import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q1424 {
    public static void main(String[] args) {
        
    }

    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<ArrayList<Boolean>> v = new ArrayList<>();
        int n = nums.size(); 
        for(int i = 0; n > i; i++){
            ArrayList<Boolean> il = new ArrayList<>();
            int m = nums.get(i).size();
            for(int j = 0; m > j; j++){
                il.add(false);
            }
            v.add(il);
        }
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(0, 0));
        v.get(0).add(0, true);
        while(!q.isEmpty()){
            pair temp = q.poll();
            int r = temp.first, c = temp.second;
            arr.add(nums.get(r).get(c));
            if(r+1 < nums.size() && c < nums.get(r+1).size() && v.get(r+1).get(c) == false){
                q.add(new pair(r+1, c));
                v.get(r+1).add(c, true);
            }
            if(r < nums.size() && c+1 < nums.get(r).size() && v.get(r).get(c+1) == false){
                q.add(new pair(r, c+1));
                v.get(r).add(c+1, true);
            }
        } 

        int[] ans = new int[arr.size()];
        for(int i = 0; arr.size() > i; i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }

    class pair{
        int first;
        int second;
        pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
}
