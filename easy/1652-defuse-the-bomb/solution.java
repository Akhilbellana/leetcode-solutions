class Solution {
    public int[] decrypt(int[] code, int k) {
        int[]res=new int[code.length];
        int sum=0;
        int n=code.length;
        if(k==0) return res;

        if(k>0){
            for(int i=1;i<=k;i++){
                sum+=code[i%n];
            }
            for(int i=0;i<n;i++){
                res[i]=sum;
                sum-=code[(i+1)%n];
                sum+=code[(i+k+1)%n];
            }
        

         } else {
            k = -k;

            for (int i = n - k; i < n; i++) {
                sum += code[i];
            }

            for (int i = 0; i < n; i++) {
                res[i] = sum;

                sum -= code[(i - k + n) % n];
                sum += code[i];
            }
        }

        return res;


        
    }}