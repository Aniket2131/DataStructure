// Using XOR gate

public class ExceptionallyOdd {
    public static void main(String[] args) {
        int Arr[] = { 1, 2, 3, 2, 3, 1, 3 };
        System.out.println(getOddOccurrence(Arr, Arr.length));
    }

    public static int getOddOccurrence(int[] arr, int n) {
        int ans = 0;
        for (Integer el : arr) {
            ans ^= el;
        }
        return ans;
    }
}
