public class Q2716 {
    public static void main(String[] args) {
        String s = "aaabc";
        System.out.println(minimizedStringLength(s));
    }

    public static int minimizedStringLength(String s) {
        int ans = 0;
        int[] charArr = new int[26];
        for (Character ch : s.toCharArray()) {
            charArr[ch - 'a']++;
        }
        for (int i = 0; charArr.length > i; i++) {
            if (charArr[i] > 0)
                ans++;
        }
        return ans;
    }

}
