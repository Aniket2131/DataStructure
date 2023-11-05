import java.util.Scanner;

public class TheTwoDish {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
		    int n = sc.nextInt();
		    int s = sc.nextInt();
		    int i = 0;
		    while(i <= n){
		        if(i + n == s){
		            System.out.println(n-i);
		            break;
		        }
		        else if(i + n > s){
		            n--;
		        }
		        else{
		            i++;
		        }
		    }
		    t--;
		}
		sc.close();
	}
}
