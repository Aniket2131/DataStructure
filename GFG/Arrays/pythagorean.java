import java.util.HashSet;

public class pythagorean{
    public static void main(String[] args) {
        
    }

    boolean checkTriplet(int[] arr, int n) {
        // code here
        HashSet<Integer> s = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for(int el : arr) {
            if(!s.contains(el)){
                s.add(el);
                set.add(el*el);
            }
        }
        for(int i = 0; n > i; i++){
            for(int j = i+1; n > j; j++){
                int a = arr[i], b = arr[j];
                if(set.contains((b * b)  + (a * a))) return true;
            }
        }
        return false;
    }
}