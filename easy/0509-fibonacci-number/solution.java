class Solution {
    public int fib(int n) {
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int a=0;
        int b=1;
        int ans=0;
        while(n>1){
            int c=a+b;
             ans=c;
            a=b;
            b=c;
            n--;
        }
        return ans;
        
    }
}