
public class Q2283 {
    public static void main(String[] args) {
        // String num = "1210";
        String num = "030";
        System.out.println(digitCount(num));
    }

    public static boolean digitCount(String num) {
        int[] arr = new int[11];
        for (Character ch : num.toCharArray()) {
            arr[ch - '0']++;
        }
        for (int i = 0; num.length() > i; i++) {
            if (Character.getNumericValue(num.charAt(i)) != arr[i])
                return false;
        }
        return true;
    }

}
