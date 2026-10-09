class Solution {
    public int triangleNumber(int[] nums) {
        long count = 0;
        Arrays.sort(nums);
        for (int k = 2; k < nums.length; k++) {
            int i = 0;
            int j = k - 1;

            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }
        return (int) count;

    }
}