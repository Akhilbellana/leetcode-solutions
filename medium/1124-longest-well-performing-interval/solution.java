class Solution {
    public int longestWPI(int[] hours) {
        int max=0;
        for(int i=0;i<hours.length;i++){
            int tired=0;
            for(int j=i;j<hours.length;j++){
                if(hours[j]>8){
                    tired++;
                }
                if(tired>(j-i+1-tired)){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
        
    }
}