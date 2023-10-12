public class Q1095{
    public static void main(String[] args) {

    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int p = findPeak(mountainArr);

        int left = leftSearch(mountainArr, target, 0, p);
        if(mountainArr.get(left) == target) return left;
        int right = rightSearch(mountainArr, target, p+1, n-1);
        if(mountainArr.get(right) == target) return right;
        return -1;
    }

    public static int findPeak(MountainArray mountainArr){
        int n = mountainArr.length();
        int l = 1, h = n-2;
        while(h != l){
            int m = l + (h - l)/2;
            if(mountainArr.get(m) < mountainArr.get(m+1)){
                l = m+1;
            }
            else{
                h = m;
            }
        }
        return l;
    }

    public static int rightSearch(MountainArray mountainArr, int target, int l, int h){
        while(h != l){
            int m = l + (h - l)/2;
            if(mountainArr.get(m) > target) l = m+1;

            else h = m;
        }
        return l;
    }

    public static int leftSearch(MountainArray mountainArr, int target, int l, int h){
        while(h != l){
            int m = l + (h - l)/2;
            if(mountainArr.get(m) < target) l = m+1;

            else h = m;
        }
        return l;
    }

    interface MountainArray {
            public int get(int index);
            public int length();
        }
}