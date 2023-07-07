public class GCD {
    public static void main(String[] args) {
        System.out.println(findGCD(13, 12));
    }

    public static int findGCD(int a, int b){
        if(b == 0) return a;

        return findGCD(b, a%b);
    }
}
