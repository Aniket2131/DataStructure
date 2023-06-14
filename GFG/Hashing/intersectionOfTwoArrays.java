import java.util.HashSet;
import java.util.Set;

public class intersectionOfTwoArrays {
    public static void main(String[] args) {
        int a[] = { 89, 24, 75, 11, 23 };
        int b[] = { 89, 2, 4 };
        System.out.println(NumberofElementsInIntersection(a, b, a.length, b.length));
    }

    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int el : a) {
            set1.add(el);
        }
        for (int el : b) {
            set2.add(el);
        }
        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);
        return intersection.size();
    }
}
