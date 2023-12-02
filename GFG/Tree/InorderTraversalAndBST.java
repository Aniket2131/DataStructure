public class InorderTraversalAndBST {
    public static void main(String[] args) {
        
    }

    static int isRepresentingBST(int arr[], int N)
    {
        // code here
        int num = arr[0];
        for(int i = 1; N > i; i++){
            if(num >= arr[i]) return 0;
            num = arr[i];
        }
        
        return 1;
    }
}
