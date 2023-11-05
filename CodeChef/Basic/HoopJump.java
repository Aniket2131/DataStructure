import java.util.Scanner;

public class HoopJump {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
		    int n = sc.nextInt();
		    System.out.println((1 + n)/2);
		    t--;
		}
		sc.close();
	}
}
