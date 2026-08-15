class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix=new int[gain.length+1];
        int len=0;
        for(int i=0;i<gain.length;i++){
            prefix[i+1]=prefix[i]+gain[i];
            len=Math.max(len,prefix[i+1]);
        }
        return len;
    }
}