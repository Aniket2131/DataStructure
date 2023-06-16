public class checkIfTwoStringsArek_AnagramsOrNot {
    public static void main(String[] args) {
        String str1 = "fodr", str2 = "gork";
        System.out.println(areKAnagrams(str1, str2, 2));
    }

    public static boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if (s1.length() != s2.length())
            return false;

        int[] arr = new int[26];
        for (char c : s1.toCharArray()) {
            arr[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            if (arr[c - 'a'] == 0) {
                k--;
                if (0 > k)
                    return false;
            } else {
                arr[c - 'a']--;
            }
        }
        return true;
    }
}
