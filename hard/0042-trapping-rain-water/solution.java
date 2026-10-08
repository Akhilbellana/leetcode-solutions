class Solution {
    public int trap(int[] height) {
        int[] sufmax = new int[height.length];
        sufmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            sufmax[i] = Math.max(sufmax[i + 1], height[i]);
        }
        int pfmax = height[0];
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            pfmax = Math.max(pfmax, height[i]);
            ans += Math.min(pfmax, sufmax[i]) - height[i];
        }
        return ans;

    }
}