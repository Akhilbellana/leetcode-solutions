class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        //for sorting only based on the price
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));

        //to store the max beauty for every index
        int[] best = new int[items.length];
        int maxBeauty = 0;
        for (int i = 0; i < items.length; i++) {
            maxBeauty = Math.max(maxBeauty, items[i][1]);
            best[i] = maxBeauty;
        }

        //binary search
        int[] ans = new int[queries.length];
        int i = 0;
        for (int x : queries) {
            int max = 0;
            int l = 0;
            int h = items.length - 1;
            while (l <= h) {
                int m = (l + h) / 2;
                if (items[m][0] <= x) {
                //we are storing max with best maximum element till the current mid
                    max = best[m];
                    l = m + 1;
                } else {
                    h = m - 1;
                }
            }
            ans[i] = max;
            i++;
        }
        return ans;
    }
}