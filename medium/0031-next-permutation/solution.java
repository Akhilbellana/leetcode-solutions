class Solution {
    public void nextPermutation(int[] nums) {
        int justsmall = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                justsmall = i - 1;
                break;
            }
        }
        int swapindex = -1;
        if (justsmall != -1) {
            for (int j = nums.length - 1; j > justsmall; j--) {
                if (nums[j] > nums[justsmall]) {
                    swapindex = j;
                    break;
                }
            }
            int temp1 = nums[justsmall];
            nums[justsmall] = nums[swapindex];
            nums[swapindex] = temp1;
            int i = justsmall + 1;
            int k = nums.length - 1;
            while (i < k) {
                int temp2 = nums[i];
                nums[i] = nums[k];
                nums[k] = temp2;
                i++;
                k--;

            }
        } else {
            int i = 0;
            int j = nums.length - 1;
            while (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;

            }
        }

    }
}