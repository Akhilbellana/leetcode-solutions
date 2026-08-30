class Solution {
    public boolean checkPerfectNumber(int num) {
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        
        if(sum==num){
            return true;
        }
    }
        return false;
        int sum=0;
}
