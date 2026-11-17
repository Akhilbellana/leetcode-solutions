# Longest Nice Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array `nums` consisting of **positive** integers.

We call a subarray of `nums` **nice** if the bitwise **AND** of every pair of elements that are in **different** positions in the subarray is equal to `0`.

Return *the length of the **longest** nice subarray*.

A **subarray** is a **contiguous** part of an array.

**Note** that subarrays of length `1` are always considered nice.

 

Original
Java
**Example 1:**

```
Input: nums = [1,3,8,48,10]
Output: 3
Explanation: The longest nice subarray is [3,8,48]. This subarray satisfies the conditions:
- 3 AND 8 = 0.
- 3 AND 48 = 0.
- 8 AND 48 = 0.
It can be proven that no longer nice subarray can be obtained, so we return 3.
```

**Example 2:**

```
Input: nums = [3,1,5,11,13]
Output: 1
Explanation: The length of the longest nice subarray is 1. Any subarray of length 1 can be chosen.

```

 

**Constraints:**

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 28.38%)  
**Memory:** 80.9 MB (beats 73.39%)  
**Submitted:** 2026-11-17T19:02:09.852Z  

```java
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max = 0;
        int i = 0;
        int j = 0;
        int mask = 0;
        while (j < nums.length) {
            while (j < nums.length && (mask & nums[j]) != 0) {
                mask = mask ^ nums[i];
                i++;
            }
            mask = mask | nums[j];
                max = Math.max(max, j - i + 1);
                j++;
        }
        return max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-nice-subarray/)