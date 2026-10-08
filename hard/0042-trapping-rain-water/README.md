# Trapping Rain Water

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

 

**Example 1:**

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

```

**Example 2:**

```
Input: height = [4,2,0,3,2,5]
Output: 9

```

 

**Constraints:**

- n == height.length
- 1 <= n <= 2 * 104
- 0 <= height[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 55.64%)  
**Memory:** 47.7 MB (beats 64.25%)  
**Submitted:** 2026-10-08T07:14:56.873Z  

```java
class Solution {
    public int trap(int[] height) {
        int[] sufmax = new int[height.length];
        sufmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            sufmax[i] = Math.max(sufmax[i + 1], height[i]);
        }
        int pfmax = height[0];
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            pfmax = Math.max(pfmax, height[i]);
            ans += Math.min(pfmax, sufmax[i]) - height[i];
        }
        return ans;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/trapping-rain-water/)