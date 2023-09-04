public class Q1 {
    public static void main(String[] args) {
        String s1 = "abcdba", s2 = "cabdab";
        System.out.println(checkStrings(s1, s2));
    }

    public static boolean checkStrings(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        StringBuilder s11 = new StringBuilder(s1);
        // // s11.append(s1);
        StringBuilder s22 = new StringBuilder(s2);
        if (n1 != n2)
            return false;
        for (int i = 0; n1 > i; i++) {
            if (s11.charAt(i) != s2.charAt(i)) {
                int j = n1 - 1;
                while (j > i) {
                    if ((j - i) % 2 == 0) {
                        if (s11.charAt(i + 2) == s22.charAt(i)) {
                            char temp = s11.charAt(i);
                            s11.setCharAt(i, s11.charAt(j));
                            s11.setCharAt(j, temp);
                            break;
                        } 
                        else if (s22.charAt(j) == s11.charAt(i)) {
                            char temp = s22.charAt(i);
                            s22.setCharAt(i, s22.charAt(j));
                            s22.setCharAt(i + 2, temp);
                            break;
                        }
                    }
                    j--;
                }
            }
        }

        return s11.toString().equals(s22.toString());
    }
    // public static boolean canBeEqual(String s1, String s2) {
    // StringBuilder s11 = new StringBuilder(s1);
    // // s11.append(s1);
    // StringBuilder s22 = new StringBuilder(s2);
    // // s22.append(s2);

    // for (int i = 0; 2 > i; i++) {
    // if (s11.charAt(i) != s2.charAt(i)) {
    // if (s11.charAt(i + 2) == s22.charAt(i)) {
    // char temp = s11.charAt(i);
    // s11.setCharAt(i, s11.charAt(i+2));
    // s11.setCharAt(i+2, temp);
    // }
    // else if (s22.charAt(i + 2) == s11.charAt(i)) {
    // char temp = s22.charAt(i);
    // s22.setCharAt(i, s22.charAt(i+2));
    // s22.setCharAt(i+2, temp);
    // }
    // }
    // }

    // return s11.toString().equals(s22.toString());
    // }
}
