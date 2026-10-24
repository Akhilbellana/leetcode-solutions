# Valid Elements in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

An element `nums[i]` is considered **valid** if it satisfies **at least** one of the following conditions:

- It is strictly greater than every element to its left.
- It is strictly greater than every element to its right.

The first and last elements are always valid.

Return an array of all valid elements in the same order as they appear in `nums`.

 

**Example 1:**

**Input:** nums = [1,2,4,2,3,2]

**Output:** [1,2,4,3,2]

**Explanation:**

- nums[0] and nums[5] are always valid.
- nums[1] and nums[2] are strictly greater than every element to their left.
- nums[4] is strictly greater than every element to its right.
- Thus, the answer is [1, 2, 4, 3, 2].

**Example 2:**

**Input:** nums = [5,5,5,5]

**Output:** [5,5]

**Explanation:**

- The first and last elements are always valid.
- No other elements are strictly greater than all elements to their left or to their right.
- Thus, the answer is [5, 5].

**Example 3:**

**Input:** nums = [1]

**Output:** [1]

**Explanation:**

Since there is only one element, it is always valid. Thus, the answer is `[1]`.

 

**Constraints:**

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 34.13%)  
**Memory:** 46.1 MB (beats 92.27%)  
**Submitted:** 2026-10-24T05:57:43.063Z  

```java
class Solution {
    public List<Integer> findValidElements(int[] nums) {
        if (nums.length <= 1) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            return list;
        }
        int[] sufmax = new int[nums.length];
        sufmax[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            sufmax[i] = Math.max(sufmax[i + 1], nums[i]);
        }
        int premax = nums[0];
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > premax || nums[i] > sufmax[i + 1]) {
                list.add(nums[i]);
            }
            premax = Math.max(premax, nums[i]);
        }
        list.add(nums[nums.length - 1]);
        return list;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-elements-in-an-array/)