public class Q1941 {
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(areOccurrencesEqual(s));
    }

    public static boolean areOccurrencesEqual(String s) {
        int[] charArr = new int[26];
        int fr = 0;
        for (int i = 0; s.length() > i; i++) {
            Character ch = s.charAt(i);
            charArr[ch - 'a']++;
            if (i == s.length() - 1) {
                fr = charArr[ch - 'a'];
            }
        }
        for (int i = 0; 26 > i; i++) {
            if (charArr[i] > 0) {
                if (charArr[i] != fr)
                    return false;
            }
        }
        return true;
    }
}
