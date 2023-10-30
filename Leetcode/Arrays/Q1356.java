public class Q1356{
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(sortByBits(arr));
    }

    public static int[] sortByBits(int[] arr) {
        int n = arr.length;
        for(int i = 0; n > i; i++){
            for(int j = 1; j < n; j++){
                int el1 = arr[j-1];
                int el2 = arr[j];
                int cnt1 = Integer.bitCount(el1);
                int cnt2 = Integer.bitCount(el2); 
                    if((cnt1 > cnt2) || (cnt1 == cnt2 && el1 > el2)){
                    int temp = el1;
                    arr[j-1] = el2;
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}