public class Q2351 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }

    public static char repeatedCharacter(String s) {
        int[] charArr = new int[26];
        for (Character ch : s.toCharArray()) {
            if (charArr[ch - 'a'] > 0)
                return ch;
            charArr[ch - 'a']++;
        }
        return '#';
    }
}
