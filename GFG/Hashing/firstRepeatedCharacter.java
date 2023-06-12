public class firstRepeatedCharacter {
    public static void main(String[] args) {
        System.out.println(firstRepChar("geeksforgeeks"));
    }

    public static String firstRepChar(String s) {
        boolean[] charArr = new boolean[26];
        for (Character ch : s.toCharArray()) {
            if (charArr[ch - 'a'] == true)
                return ch.toString();
            charArr[ch - 'a'] = true;
        }
        return "-1";
    }
}
