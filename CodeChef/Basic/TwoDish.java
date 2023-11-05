import java.util.Scanner;

public class TwoDish {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
		    int n = sc.nextInt();
            int fr = sc.nextInt();
            int v = sc.nextInt();
            int f = sc.nextInt();
		    int to = 0;
		    if(fr < v){
		        to += fr;
		        v -= fr;
		    }
		    else{
		        to += v;
		        v -= fr;
		    }
		    if(f > v && v > 0){
		        to += v;
		        v -= f;
		    }
		    else if(f <= v){
		        to += f;
		        v -= f;
		    }
		    if(to < n){
		        System.out.println("NO");         
		    }
		    else{
		        System.out.println("YES");
		    }
		    
		    t--;
		}
		sc.close();
	}
}
