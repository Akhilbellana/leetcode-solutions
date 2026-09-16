class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int[]a=new int[2*n];
        int k=0;
        while(j<nums.length && i<n){
            a[k]=nums[i];
            k++;
            a[k]=nums[j];
            k++;
            i++;
            j++;

        }
        return a;
        
    }
}