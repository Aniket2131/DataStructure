import java.util.ArrayList;
import java.util.Scanner;

public class Q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int turn = 0;
            boolean f = true;

            while (n > 0) {
                int num = n;
                ArrayList<Integer> li = new ArrayList<>();
                for (int i = 3; i <= Math.sqrt(num); i += 2) {

                    while (num % i == 0) {
                        li.add(i);
                        num /= i;
                    }
                }

                if (n > 2)
                    li.add(num);

                if (li.size() == 0) {
                    if (turn % 2 == 0)
                        System.out.println("Bob");
                    else
                        System.out.println("Alice");
                        f = false;    
                        break;    
                } else {
                    turn++;
                    n -= li.get(li.size() - 1);
                }
            }
            if(f){
                if (turn % 2 == 0)
                        System.out.println("Bob");
                    else
                        System.out.println("Alice");
                    break;
            }
            t--;
        }
    }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int t = sc.nextInt();
    // while(t -- > 0){
    // int[] des = new int[2];
    // for(int i = 0; 2 > i; i++){
    // des[i] = sc.nextInt();
    // }
    // int[] arr = new int[des[0]];
    // for(int i = 0; arr.length > i; i++){
    // arr[i] = sc.nextInt();
    // }
    // int i = 0, j = 0;
    // int or = 1, cnt = 0, ans = 0;
    // while(j < arr.length){
    // cnt++;
    // or = or | arr[j];
    // if(cnt == des[1]){
    // cnt--;
    // if(or % 2 != 0) ans++;
    // or = (or | (~arr[i]));
    // i++;
    // }
    // j++;
    // }
    // System.out.println(ans);
    // }

    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int[] arr = new int[3];
    // for(int i = 0; arr.length > i; i++){
    // arr[i] = sc.nextInt();
    // }
    // if(arr[0] > arr[1] && arr[0] > arr[2]) System.out.println("Yes");
    // else System.out.println("No");

    // sc.close();
    // }

}
