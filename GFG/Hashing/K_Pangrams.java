public class K_Pangrams {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        System.out.println(kPangram(str, str.length()));
    }

    public static boolean kPangram(String str, int k) {
        // code here
        // str = str.trim();
        if (26 > str.length())
            return false;
        int[] charArr = new int[26];
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                charArr[ch - 'a']++;
            }
        }
        int i = 0;
        int j = 0;
        for (int el : charArr) {
            if (el == 0) {
                i++;
            }
            if (el > 1)
                j += el - 1;
            if (i > k)
                return false;
        }

        return i > j ? false : true;
    }
}
