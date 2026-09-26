class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[arr.length-1]>arr[arr.length-2]){
            return arr.length-1;
        }
        int l=1;
        int h=arr.length-2;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]>arr[m-1]&&arr[m]<arr[m+1]){
                l=m+1;
            }else if(arr[m]<arr[m-1]&& arr[m]>arr[m+1]){
                h=m-1;
            }else{
                return m;
            }

        }
        return -1;
    }
}