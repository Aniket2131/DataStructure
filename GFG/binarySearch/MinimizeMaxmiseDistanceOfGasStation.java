import java.util.PriorityQueue;

public class MinimizeMaxmiseDistanceOfGasStation {
    public static void main(String[] args) {
        int stations[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int K = 9;
        System.out.println(findSmallestMaxDist(stations, K));
    }

    public static double findSmallestMaxDist(int stations[],int K) {
    // code here
    PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));
    
    int n = stations.length;
    
    for(int i = 0; n-1 > i; i++){
        pq.add(new pair(stations[i+1] - stations[i], i));
    }
    
    int[] partition = new int[n - 1];
    
    for(int i = 1; K >= i; i++){
        pair arr = pq.poll();
        int ind = arr.second;
        partition[ind]++;
        double indiff = stations[ind + 1] - stations[ind];
        double newSecLen = indiff/(double)(partition[ind] + 1);
        pq.add(new pair(newSecLen, ind));
    }
    return pq.peek().first;
  }

  public static class pair{
    double first;
    int second;

    pair(double first, int second){
        this.first = first;
        this.second = second;
    }
  }
}
