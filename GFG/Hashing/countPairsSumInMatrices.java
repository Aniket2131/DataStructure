import java.util.HashSet;
import java.util.Set;

public class countPairsSumInMatrices {
    public static void main(String[] args) {
        int[][] mat1 = { { 1, 5, 6 },
                { 8, 10, 11 },
                { 15, 16, 18 } };
        int[][] mat2 = { { 2, 4, 7 },
                { 9, 10, 12 },
                { 13, 16, 20 } };
        System.out.println(countPairs(mat1, mat2, mat1.length, 26));
    }

    public static int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; mat2.length > i; i++) {
            for (int j = 0; mat2[i].length > j; j++) {
                set.add(mat2[i][j]);
            }
        }

        for (int i = 0; mat1.length > i; i++) {
            for (int j = 0; mat1[i].length > j; j++) {
                if (set.contains(x - mat1[i][j])) {
                    ans++;
                }
            }
        }
        return ans;

    }
}
