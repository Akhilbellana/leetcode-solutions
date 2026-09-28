class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for (int n : nums) {
            max = Math.max(max, n);
        }
        int l = 1;
        int h = max;
        int ans = -1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            long total = 0;
            for (int n : nums) {
                total += (n + m - 1) / m;
            }
            if ((total) <= threshold) {
                ans = m;
                h = m - 1;
            } else {
                l = m + 1;
                ;
            }
        }
        return ans;

    }
}