public class formAnumberDivisibleBY3{
    public static void main(String[] args) {
        
    }

    static int isPossible(int N, int arr[]) {
        // code here
        int sum = 0;
        for(int i = 0; N > i; i++){
            int nums = arr[i];
            int s = 0;
            while(nums > 0){
                s += (nums%10);
                nums /= 10;
            }
            sum += s;
        }
        return sum % 3 == 0 ? 1: 0; 
    }
}