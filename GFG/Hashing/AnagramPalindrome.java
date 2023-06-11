public class AnagramPalindrome {
    public static void main(String[] args) {
        String S = "geeksogeeks";
        System.out.println(isPossible(S));
    }

    public static int isPossible(String S) {
        int[] charArr = new int[26];
        for (Character ch : S.toCharArray()) {
            charArr[ch - 'a'] += 1;
        }
        boolean flag = false;
        for (int i = 0; charArr.length > i; i++) {
            if (charArr[i] % 2 != 0) {
                if (flag)
                    return 0;
                flag = true;
            }
        }
        return 1;
    }
}
