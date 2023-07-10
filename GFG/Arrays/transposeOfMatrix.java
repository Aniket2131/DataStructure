public class transposeOfMatrix{
    public static void main(String[] args) {
        int mat[][] = {{1, 1, 1, 1},
           {2, 2, 2, 2},
           {3, 3, 3, 3},
           {4, 4, 4, 4}};
        transpose(mat.length, mat);
        System.out.println(mat);
    }

    public static void transpose(int n,int a[][])
    {
        for(int i = 0; a.length > i; i++){
            for(int j = i; a.length > j; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
}