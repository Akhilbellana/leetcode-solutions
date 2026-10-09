class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0;
        int h = arr.length - 1;
        int mid=-1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if ((arr[m] - (m + 1)) >= k) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l + k;

    }
}