class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            boolean valid = true;
            int l = 0;
            int h = arr2.length - 1;
            while (l <= h) {
                int m = l + (h - l) / 2;
                if ((arr1[i] - d) <= arr2[m] && (arr1[i] + d) >= arr2[m]) {
                    valid = false;
                    break;
                } else if ((arr1[i] - d) > arr2[m]) {
                    l = m + 1;
                } else {
                    h = m - 1;
                }
            }
            if (valid) {
                ans++;
            }
        }
        return ans;

    }
}