package leetcode;

public class _35 {
    public static void main(String[] args) {
        _35 m = new _35();
        int[] arr = new int[]{1,3,5};
        int target = 7;
        int r = m.searchInsert(arr, target);
        System.out.println("result = " + r);

    }

    public int searchInsert(int[] arr,int target){
        int start=0;
        int end=arr.length;
        int m=-1;
        if(target<arr[0]) return 0;
        if(target>arr[arr.length-1]) return arr.length;
        while(end>start){
            m=(start+end)/2;
            if(target==arr[m]) return m;
            if(target > arr[m]) start=m+1;
            if(target < arr[m]) end=m;
        }

        return (start+end)/2;
    }
}

