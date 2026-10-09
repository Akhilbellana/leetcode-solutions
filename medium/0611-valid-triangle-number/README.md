# Valid Triangle Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, return *the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle*.

 

**Example 1:**

```
Input: nums = [2,2,3,4]
Output: 3
Explanation: Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3

```

**Example 2:**

```
Input: nums = [4,2,3,4]
Output: 4

```

 

**Constraints:**

- 1 <= nums.length <= 1000
- 0 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 27 ms (beats 86.83%)  
**Memory:** 45.5 MB (beats 89.30%)  
**Submitted:** 2026-10-09T18:12:42.502Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/valid-triangle-number/)