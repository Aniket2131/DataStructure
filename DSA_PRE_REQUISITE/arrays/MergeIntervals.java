import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals{
    public static void main(String[] args) {
        int[][] intervals =  {{1,3},{8,10},{2,6},{15,18}};
        System.out.println(merge(intervals));
    }

    public static ArrayList<ArrayList<Integer>> merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int s = intervals[0][0];
        int e = intervals[0][1];
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 1; intervals.length > i; i++){
            if(intervals[i][0] <= e){
                e = intervals[i][1];
            }
            else{
                ArrayList<Integer> in = new ArrayList<>();
                in.add(s);
                in.add(e);
                arr.add(in);
                s = intervals[i][0];
                e = intervals[i][1];
            }
        }
        ArrayList<Integer> in = new ArrayList<>();
        in.add(s);
        in.add(e);
        arr.add(in);
        return arr;
    }
}