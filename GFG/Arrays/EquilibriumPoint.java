public  class EquilibriumPoint{
    public static void main(String[] args) {
        
    }

    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int sum = 0;
        for(long el : arr){
            sum += el;
        }
        
        int pre = 0;
        for(int i = 0; n > i; i++){
            sum -= arr[i];
            if(sum == pre) return i+1;
            pre += arr[i];
        }
        return -1;
    }
}