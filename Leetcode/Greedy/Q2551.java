import java.util.ArrayList;
import java.util.Collections;

public class Q2551{
    public static void main(String[] args) {
        int weights[] = {1,3,5,1}, k = 2;
        System.out.println(putMarbles(weights, k));
    }

    public static long putMarbles(int[] weights, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; weights.length > i; i++){
            arr.add(weights[i] + weights[i - 1]);
        }

        Collections.sort(arr);
        long num1 = 0, num2 = 0;
        for(int i = 0; k - 1 > i; i++){
            num1 += arr.get(i);
            num2 += arr.get(arr.size() - i - 1);
        }

        return num2 - num1;
    }
}