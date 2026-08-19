class Solution {
    public int pivotInteger(int n) {
        int sum=0;
        int[] prefix=new int[n+1];
        for(int i=1;i<n;i++){
            prefix[i+1]=prefix[i]+i;
        }
        prefix[0]=0;
        for(int i=1;i<n;i++){
            if(prefix[i]==prefix[n]-prefix[i+1]){
        }
                return i;
            }
    }
        return -1;
}
