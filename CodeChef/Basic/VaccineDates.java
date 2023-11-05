import java.util.Scanner;

public class VaccineDates {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
		    int D = sc.nextInt(), L = sc.nextInt(), R = sc.nextInt();
		    if(D < L){
		        System.out.println("Too Early");
		    }
		    else if(D > R){
		        System.out.println("Too Late");
		    }
		    else{
		        System.out.println("Take second dose now");
		    }
		    t--;
		}
		sc.close();
	}
}
