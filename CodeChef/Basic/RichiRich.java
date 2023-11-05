import java.util.Scanner;

public class RichiRich{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
		    int[] arr = new int[3];
		    for(int i = 0; 3 > i; i++){
		        arr[i] = sc.nextInt();
		    }
		    System.out.println((arr[1]-arr[0])/arr[2]);
		    t--;
		}
        sc.close();
	}
}