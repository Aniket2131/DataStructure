public class Q1704{
    public static void main(String[] args) {
        
    }

    public boolean halvesAreAlike(String s) {
        int front = 0, back = 0, n = s.length();
        char[] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(int i = 0; n/2 > i; i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(n - i -1);

            for(int j = 0; 10 > j; j++){
                char ch = arr[j];
                if(ch == ch1) front++;

                if(ch == ch2) back++;
            }
        }
        System.out.println(front);
        System.out.println(back);
        return front == back;
    }
}