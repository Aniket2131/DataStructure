public class Q2391{
    public static void main(String[] args) {
        String[] garbage = {"G","P","GP","GG"};
        int[] travel = {2,4,3};
        System.out.println(garbageCollection(garbage, travel));
    }
    
    static String[] g;
    static int[] t;
    public static int garbageCollection(String[] garbage, int[] travel) {
        int ans = 0;
        int lip = -1, lig = -1, lim = -1, p = 0, g = 0, m = 0;
        int n = garbage.length;
        for(int i = 0; n > i; i++){
              for(char ch : garbage[i].toCharArray()){
                if(ch == 'M'){
                    m++;
                    lim = i;
                }
                else if(ch == 'G'){
                    g++;
                    lig = i;
                }
                else{
                    p++;
                    lip = i;
                }
            }
        }
        
        int[] pre = new int[travel.length+1];
        pre[0] = travel[0];
        for(int i = 1; travel.length > i; i++){
            pre[i] = travel[i] + pre[i-1];
        }

        if(lip > 0){
            ans += pre[lip-1];
        }
        if(lim > 0){
            ans += pre[lim-1];
        }
        if(lig > 0){
            ans += pre[lig-1];
        }
        return ans+p+g+m;
    }

}