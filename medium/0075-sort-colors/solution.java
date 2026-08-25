class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int curr = 0;
        int j = nums.length - 1;
        while (curr <= j) {
            if (nums[curr] == 2) {
                int temp1 = nums[curr];
                nums[curr] = nums[j];
                nums[j] = temp1;
                j--;
                if (nums[curr] == 0) {
                    int temp2 = nums[curr];
                    nums[curr] = nums[i];
                    nums[i] = temp2;
                    i++;
                    curr++;
                }

            } else if (nums[curr] == 0) {
                int temp3 = nums[curr];
                nums[curr] = nums[i];
                nums[i] = temp3;
                i++;
                curr++;
            } else {
                curr++;
            }
        }

    }
}