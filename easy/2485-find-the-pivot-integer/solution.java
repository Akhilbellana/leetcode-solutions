class Solution {
    public int pivotInteger(int n) {
        int[] prefix=new int[n+1];
        prefix[0]=0;
        for(int i=1;i<n;i++){
            prefix[i+1]=prefix[i]+i;
        }
        for(int i=1;i<n+1;i++){
            if(prefix[i]==prefix[n]-prefix[i]){
                return i;
            }
        }
        return -1;
    }
}