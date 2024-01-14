import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class findDuplicateRowsInBinaryMatrix {
    public static void main(String[] args) {
        
    }

    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
        Set<String> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; m > i; i++){
            String s = "";
            for(int j = 0; n > j; j++){
                s += matrix[i][j];
            }
            if(set.contains(s)){
                arr.add(i);
            }
            else {
                set.add(s);
            }
        }
        return arr;
    }
}
