class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = Integer.MIN_VALUE;
        int h = 0;
        for (int x : weights) {
            l = Math.max(l, x);
            h += x;
        }
        int ans = 0;
        while (l <= h) {
            int m = l + (h - l) / 2;
            int daycount = 1;
            int sum = 0;
            for (int x:weights) {
                if(sum+x>m){
                    daycount++;
                    sum=0;
                }
                sum+=x;
            }
            if (daycount <= days) {
                ans = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;

    }
}