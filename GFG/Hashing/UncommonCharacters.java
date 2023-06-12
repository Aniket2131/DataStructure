public class UncommonCharacters {
    public static void main(String[] args) {
        String A = "geeksforgeeks";
        String B = "geeksquiz";
        System.out.println(UncommonChars(A, B));
    }

    public static String UncommonChars(String A, String B) {
        // code here
        String ans = "";
        int[] strArr1 = new int[26];
        int[] strArr2 = new int[26];
        for (Character ch : A.toCharArray()) {
            strArr1[ch - 'a'] = 1;
        }
        for (Character ch : B.toCharArray()) {
            strArr2[ch - 'a'] = 1;
        }
        for (int i = 0; 26 > i; i++) {
            if (strArr1[i] != strArr2[i]) {
                ans += (char) (i + 97);
            }
        }
        return ans == "" ? "-1" : ans;
    }
}
