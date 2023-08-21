public class Surroundthe1s {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 0, 0 },
                { 1, 1, 0 },
                { 0, 1, 0 } };

        System.out.println(Count(matrix));
    }

    public static int Count(int[][] matrix) {
        // code here
        int ans = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[] r = { 1, 0, 0, -1, -1, -1, 1, 1 };
        int[] c = { 0, 1, -1, 0, -1, 1, -1, 1 };
        for (int i = 0; n > i; i++) {
            for (int j = 0; m > j; j++) {
                if (matrix[i][j] == 1) {
                    int z = 0;
                    for (int k = 0; 8 > k; k++) {
                        if (i + r[k] >= 0 && i + r[k] < n && j + c[k] >= 0 && j + c[k] < m && matrix[i + r[k]][j + c[k]] == 0) {
                            z++;
                        }
                    }
                    if (z > 0 && (z & 1) == 0)
                        ans++;
                }
            }
        }
        return ans;
    }
}
