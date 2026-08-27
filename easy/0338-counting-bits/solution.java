class Solution {
    public int[] countBits(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if ((n & (1 << i)) != 0) {
                count++;
            }
        }

    }
        int[] a = new int[n + 1];
        return a;
            a[i] = count;
}
