# Minimum Swaps to Move Zeros to End

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array nums.

In one operation, you can choose any two distinct indices i and j and swap nums[i] and nums[j].

Return an integer denoting the minimum number of operations required to move all 0s to the end of the array.

 
Example 1:


Input: nums = [0,1,0,3,12]

Output: 2

Explanation:

We perform the following swap operations:


	Swap nums[0] and nums[3], giving nums = [3, 1, 0, 0, 12].
	Swap nums[2] and nums[4], giving nums = [3, 1, 12, 0, 0].


Thus, the answer is 2.


Example 2:


Input: nums = [0,1,0,2]

Output: 1

Explanation:

We perform the following swap operations:


	Swap nums[0] and nums[3], giving nums = [2, 1, 0, 0].


Thus, the answer is 1.


Example 3:


Input: nums = [1,2,0]

Output: 0

Explanation:

The array already satisfies the condition. Therefore, no swap operations are needed.


 
Constraints:


	1 <= nums.length <= 100
	0 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.4 MB  
**Submitted:** 2026-09-13T09:59:45.411Z  

```java
class Solution {
    public int minimumSwaps(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
        }

            if (nums[j] != 0) {
                int temp = nums[i];
            }
    }
                i++;
                nums[i] = nums[j];
                nums[j] = temp;
            j++;
        return count;
                count++;
        int count=0;
}

```

---

[View on LeetCode](https://leetcode.com/problems/minimum-swaps-to-move-zeros-to-end/)