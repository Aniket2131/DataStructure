public class Q1832 {
    public static void main(String[] args) {
        String  S = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(S));
    }

    public static boolean checkIfPangram(String sentence) {
        if(26 > sentence.length()) return false;
        for(int i = 1; 26>=i; i++){
            if(0 > sentence.indexOf((char)i+96)) return false;
        }
        return true;
    }
}
