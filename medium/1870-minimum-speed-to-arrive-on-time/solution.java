class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int l = 1;
        int h = 10000000;
        int ans = -1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            double total = 0;
            for (int i = 0; i < dist.length - 1; i++) {
                total += (dist[i] + m - 1) / m;
            }
            total += (double) (dist[dist.length - 1]) / m;
            if (total <= hour) {
                ans = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;

    }
}