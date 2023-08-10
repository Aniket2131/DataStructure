public class searchinaRotatedArray {
    public static void main(String[] args) {
        int A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3} , key = 10, l = 0 , h = 8;
        System.out.println(search(A, l, h, key));
    }

    public static int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        if(l > h) return -1;

        int m = l + (h - l)/2;

        if(A[m] == key) return m;

        if(A[m] >= A[l]){
            if(key >= A[l] && A[m] >= key){
                return search(A, l, m-1,key);
            }
            else{
                return search(A, m + 1, h,key);
            }
        }
        else{
            if(key >= A[m] && A[h] >= key){
                return search(A, m + 1, h,key);
            }
            else{
                return search(A, l, m - 1,key);
            }
        }
    }
}
