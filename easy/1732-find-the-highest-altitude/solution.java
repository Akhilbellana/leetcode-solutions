class Solution {
    public int largestAltitude(int[] gain) {
        int len=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            len=Math.max(len,sum);
        }
        return len;
    }
}