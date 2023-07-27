public class Q2141{
    public static void main(String[] args) {
        int n = 2, batteries[] = {3,3,3};
        System.out.println(maxRunTime(n, batteries));
    }

    public static long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for(int el : batteries){
            sum += el;
        }
        long start = 0, end = sum, ans = 0;
        while(end >= start){
            long m = (start + end)/2;
            if(possible(n, batteries, m)){
                ans = m;
                start = m + 1;
            }
            else{
                end = m - 1;
            }
        }
        return ans;
    }

    public static Boolean possible(int n, int[] batteries, long m){
        long sum = 0;
        for(int el : batteries){
            if(el <= m) sum += el;
            else{
                sum += m;
            }
        }
        return sum >= n * m;
    } 
}