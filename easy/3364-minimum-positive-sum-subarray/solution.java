class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int[] prefix = new int[nums.size() + 1];
        for (int i = 0; i < nums.size(); i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }
        int min = Integer.MAX_VALUE;
        boolean valid = false;
        for (int i = l; i <= nums.size(); i++) {
            for (int j = l; j <= r; j++) {
                int index = i - j;

                if (index >= 0) {
                    int sum = prefix[i] - prefix[index];

                    if (sum > 0) {
                        min = Math.min(min, sum);
                        valid = true;
                    }
                }
            }

        }
        return valid ? min : -1;

    }
}