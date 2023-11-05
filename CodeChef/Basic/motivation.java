import java.util.Scanner;

public class motivation {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
		    int n = sc.nextInt(), s = sc.nextInt();
		    int ans = 0;
		    for(int i = 0; n > i; i++){
		        int sp = sc.nextInt(), r = sc.nextInt();
		        if(sp <= s && r > ans) ans = r;
		    }
		    System.out.println(ans);
		    t--;
		}
	    sc.close();
	}
}
