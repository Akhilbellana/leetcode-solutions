class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=Integer.MIN_VALUE;
        int h=0;
        for(int x:weights){
            l=Math.max(l,x);
            h+=x;
        }
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            int daycount=0;
            int sum=0;
            for(int i=0;i<weights.length;i++){
                sum+=weights[i];
                if(sum==m){
                    daycount++;
                    sum=0;
                }
                else if(sum>m){
                    i--;
                    daycount++;
                    sum=0;
                }
            }
            if(sum>0){
                daycount++;
            }
            if(daycount<=days){
                ans=m;
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
        
    }
}