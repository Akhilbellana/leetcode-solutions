class Solution {
    public int minDays(int[] bloomDay, int b, int k) {
        int l=1;
        int h=Integer.MIN_VALUE;
        for(int x:bloomDay){
            h=Math.max(h,x);
        }
        int ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            int adj=0;
            int total=0;
            for(int x:bloomDay){
                if(x<=m){
                    adj++;
                }else{
                    adj=0;
                }
                if(adj==k){
                    total++;
                    adj=0;
                }
            }
            if(total>=b){
                ans=m;
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;

        
    }
}