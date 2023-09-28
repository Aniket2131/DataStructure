public class sqrt {
    public static void main(String[] args) {
        
    }

    long floorSqrt(long x)
	 {
		// Your code here
		long s = 0;
		long e = x;
		while(e >= s){
		    long m = s + (e - s)/2;
		    if(m * m == x) return m;
		    else if(m*m < x){
		        s = m+1;
		    }
		    else{
		        e = m-1;
		    }
		}
		return e;
	 }
}
