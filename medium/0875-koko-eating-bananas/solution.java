class Solution {
    public int minEatingSpeed(int[] piles, int hours) {
        int max=Integer.MIN_VALUE;
        for(int n:piles){
            max=Math.max(max,n);
        }
        int l=1;int h=max;
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            long total=0;
            
            for(int n:piles){
                total=total+((long)n+m-1)/m;
            }
            if(total<=hours){
                ans=m;
                h=m-1;
            }else{
               l=m+1;
            }
        }
        return ans;
        
    }
}