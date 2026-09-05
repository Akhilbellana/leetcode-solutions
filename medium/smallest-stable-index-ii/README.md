# Smallest Stable Index Ii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T14:13:13.533Z  

```unknown
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int low = 0;
4        int high = nums.length - 1;
5        while (low <= high) {
6            int mid = (low + high) / 2;
7            if (nums[mid] == target) {
8                return mid;
9            } else if (nums[mid] > target) {
10                high = mid - 1;
11            } else {
12                low = mid + 1;
13            }
14        }
15        return low;
16
17    }
18}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-stable-index-ii/)