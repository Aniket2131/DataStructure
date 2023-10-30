public class sumOfXOR {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(a);
        System.out.println(~a);
        int arr[] = {5, 9, 7, 6};
        System.out.println(sumXOR(arr, arr.length));
    }

    public static long sumXOR (int arr[], int n) {
        //Complete the function
        long sum = 0;
        for (int i = 0; i < 32; i++) 
        {
            // Count of zeros and ones
            long zc = 0, oc = 0; 
             
            for (int j = 0; j < n; j++)
            {
                if (arr[j] % 2 == 0)
                    zc++;
                else
                    oc++;
                arr[j] /= 2;
            }
     
            // final sum 
            sum += oc * zc * (1 << i); 
        }
        return sum;
    }
}
