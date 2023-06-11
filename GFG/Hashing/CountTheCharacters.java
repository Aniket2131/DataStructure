public class CountTheCharacters {
    public static void main(String[] args) {
        String S = "geeksforgeeks";
        System.out.println(getCount(S, 2));
    }

    public static int getCount(String S, int N) {
        // your code here
        int[] charArr = new int[26];
        int i = 0;
        while (S.length() > i) {
            char ch = S.charAt(i);
            charArr[ch - 'a'] += 1;
            i++;
            while (S.length() > i && S.charAt(i) == ch) {
                i++;
            }
        }

        int ans = 0;
        for (int j = 0; charArr.length > j; j++) {
            if (charArr[j] == N) {
                ans++;
            }
        }
        return ans;
    }
}
