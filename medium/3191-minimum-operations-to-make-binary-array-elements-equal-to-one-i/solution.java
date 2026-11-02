class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                continue;
            }
            if (i + 2 >= nums.length) {
                return -1;

            } else {
                for (int j = i; j < nums.length && j < i + 3; j++) {
                    if (nums[j] == 0) {
                        nums[j] = 1;
                    } else {
                        nums[j] = 0;
                    }
                }
                count++;

            }
        }
        return count;

    }
}