class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int temp=(a&b)<<1;
            a=a^b;//for calculating sum without carry
            b=temp;//for getting the carrry
        }
        return a;
        
    }
}