class Solution {
    public int[] countBits(int n) {
        
        int[] a = new int[n + 1];
        a[0]=0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int val=i;
            while(val>0){
            if ((val & 1) != 0) {
                count++;
            }
            val=val>>1;
            }
            a[i] = count;
        }
        return a;

    }
}