public class Q1935 {
    public static void main(String[] args) {
        String text = "hello world", brokenLetters = "ad";
        System.out.println(canBeTypedWords(text, brokenLetters));
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        int[] charArr = new int[26];
        for (char ch : brokenLetters.toCharArray()) {
            charArr[ch - 'a']++;
        }
        int broken = 0;
        int word = 0;
        for (int i = 0; text.length() > i; i++) {
            if (text.charAt(i) != ' ' && charArr[text.charAt(i) - 'a'] > 0) {
                broken += 1;
                while (text.length() > i && text.charAt(i) != ' ')
                    i++;
                if (text.length() > i)
                    word++;
            } else if (text.charAt(i) == ' ')
                word++;
        }
        return word - broken + 1;
    }
}
