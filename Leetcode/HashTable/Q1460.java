public class Q1460 {
    public static void main(String[] args) {
        int[] target = { 1, 2, 3, 4 }, arr = { 2, 4, 1, 3 };
        System.out.println(canBeEqual(target, arr));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        int[] numArr = new int[1001];
        for (int i = 0; arr.length > i; i++) {
            numArr[target[i]]++;
            numArr[arr[i]]--;
        }
        for (int el : numArr) {
            if (el != 0)
                return false;
        }
        return true;
    }
}
