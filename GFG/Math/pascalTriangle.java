import java.util.ArrayList;

public class pascalTriangle{
    public static void main(String[] args) {
        System.out.println(nthRowOfPascalTriangle(4));
    }

    public static ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<ArrayList<Long>> arr = new ArrayList<>();
        for(int i = 0; n >= i; i++){
            ArrayList<Long> temp = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    temp.add((long)(1));
                }
                else{
                    long v = arr.get(i-1).get(j-1) + arr.get(i-1).get(j);
                    temp.add(v);
                }
            }
            arr.add(temp);
        }
        return arr.get(n);
    }
}