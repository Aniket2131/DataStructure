import java.util.ArrayList;

public class BrotherFromDifferenttree {

    class Node
{
	int data;
	Node left, right;

	Node(int val) {
		data = val;
		left = right = null;
	}
}
    public static void main(String[] args) {
        
    }

    static ArrayList<Integer> arr1;
    static ArrayList<Integer> arr2;
    public static void solve(Node root, boolean f){
        
        if(root == null) return;
        
        solve(root.left, f);
        
        if(f) {
            arr1.add(root.data);
        }
        else {
            arr2.add(root.data);
        }
        
        solve(root.right, f);
    }
    
	public static int countPairs(Node root1, Node root2, int x)
	{
		// Code here
		arr1 = new ArrayList<>();
		arr2 = new ArrayList<>();
		
		solve(root1, true);
		solve(root2, false);
		
		int ans = 0;
		int n = arr1.size(), m = arr2.size();
		int i = 0, j = m-1;
		
		while(i < n && j >= 0){
		    
		    int el1 = arr1.get(i), el2 = arr2.get(j);
		    
		    if(el1 + el2 == x) {
		        ans++;
		        i++;
		        j--;
		    }
		    else if(el1 + el2 > x) {
		        j--;
		    }
		    
		    else {
		        i++;
		    }
		    
		}
		return ans;
	}
}
