class Solution {
    public int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        int left=0;
        int right=x/2;
        while(left<=right){
            int mid=left+(right-left)/2;
            if((long)mid*mid==x){
                return mid;
            }else if((long)mid*mid>=x){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left-1;
        
    }
}