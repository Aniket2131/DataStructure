public class findkthElementOfSpiralMatrix {
    public static void main(String[] args) {
        int n = 6, m = 4, k = 22;
        // int n = 4, m = 4, k = 10;
        // int A[][] = {{1,  2,  3,  4},
        //          {5,  6,  7,  8},
        //          {9 , 10, 11, 12},
        //          {13, 14, 15, 16}};
        // int A[][] = {{1,  2,  3},
        //          {4,  5,  6},
        //         };
        int A[][] = {{-3, -2, 0, -6},
            {-7, -4, -2, 0},
            {-4, 0 ,-1, -7},
            {-7, -3, -9, -8},
            {-8, 6, 0 ,-8},
            {1 , 5, 9, 7}};
        System.out.println(findK(A, n, m, k));         
    }

    public static int findK(int A[][], int n, int m, int k)
    {
	// Your code here
	int top = 0, left = 0, right = m - 1, bottom = n - 1;
    while(bottom >= top && right >= left){
        for(int i = left; right >= i; i++){
            k--;
            if(k == 0) return A[top][i];
        }
        top++;
        for(int i = top; bottom >= i; i++){
            k--;
            if(k == 0) return A[i][right];
        }
        right--;
        for(int i = right; i >= left; i--){
            k--;
            if(k == 0) return A[bottom][i];
        }
        bottom--;
        for(int i = bottom; i >= top; i--){
            k--;
            if(k == 0) return A[i][left];
        }
        left++;
    }
	return -1;
    }
}
