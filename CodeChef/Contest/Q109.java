import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Q109 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
		    int n = sc.nextInt();
		    Integer[] arr = new Integer[n];
		    HashMap<Integer, Integer> map = new HashMap<>();
		    for(int i = 0; n > i; i++){
		        arr[i] = sc.nextInt();
		        map.put(arr[i], map.getOrDefault(arr[i], 0)  + 1);
		    }
		    Arrays.sort(arr, Collections.reverseOrder());
		    boolean flag = false;
		    int[] ans = new int[n];
		    for(int i = 0; n/2 > i; i++){
		        int f = arr[i];
		        int s = arr[i+(n/2)];
		        int a = (int) Math.ceil(((f * 1.0) + (s*1.0))/2);
		        int b = f - a;
		        ans[i] = a;
		        ans[n-i-1] = b;
		        int k1 = a + b, k2 = Math.abs(a - b);
		        if(map.containsKey(k1)){
		            map.put(k1, map.get(k1)-1);
		            if(map.get(k1) <= 0) map.remove(k1);
		        }
		        else{
		            flag = true;
		            break;
		        }
		        if(map.containsKey(k2)){
		            map.put(k2, map.get(k2)-1);
		            if(map.get(k2) <= 0) map.remove(k2);
		        }
		        else{
		            flag = true;
		            break;
		        }
		    }
		    if(flag) System.out.println(-1);
		    else {
		        for(int i = 0; n > i; i++){
		            System.out.print(ans[i] + " ");
		        }
		    }
		    t--;
		}
		sc.close();
	}
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
	// 	int t = sc.nextInt();
	// 	while(t > 0){
	// 	    int n = sc.nextInt();
	// 	    int[] arr = new int[n];
	// 	    for(int i = 0; n > i; i++){
	// 	        arr[i] = sc.nextInt();
	// 	    }
	// 	    int xor = arr[0];
	// 	    for(int i = 1; n > i; i++){
	// 	        xor = (xor ^ arr[i]);
	// 	    }
	// 	    int ans = xor;
	// 	    for(int i = 0; n > i; i++){
	// 	        ans = Math.min(ans, ans^arr[i]);
	// 	    }
	// 	    System.out.println(ans);
	// 	    t--;
	// 	}
    //     sc.close();
    // }


}
