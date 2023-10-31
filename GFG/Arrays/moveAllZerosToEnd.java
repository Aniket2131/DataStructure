public class moveAllZerosToEnd{
    public static void main(String[] args) {
        
    }

    void pushZerosToEnd(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return;
        }
        int i = 0;
        int j = 1;

        while (n > j) {
            if (arr[i] == 0) {
                if (arr[j] == 0) {
                    j++;
                } else {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j++;
                }
            } else {
                i++;
                j++;
            }
        }
    }
}