class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1;
        int h=num/2;
        if(num==1){
            return true;
        }
        while(l<=h){
            int m=l+(h-l)/2;
            if((long)m*m==num){
                return true;
            }else if((long)m*m >num){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return false;
        
    }
}