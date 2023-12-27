public class Q1578{
    public static void main(String[] args) {
        String colors = "abaac";
        int[] neededTime = {1,2,3,4,5};
        System.out.println(minCost(colors, neededTime));
    }

    public static int minCost(String colors, int[] neededTime) {
        int ans = 0;
        int n = colors.length(), pre = neededTime[0];
        for(int i = 1; n > i; i++){
            if(colors.charAt(i) != colors.charAt(i-1)){
                pre = 0;
            }
            ans += Math.min(pre, neededTime[i]);
            pre = Math.max(pre, neededTime[i]);
        }

        return ans;
    }
}