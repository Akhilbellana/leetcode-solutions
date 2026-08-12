# Length Of Longest Subarray With At Most K Frequency

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-12T10:07:03.564Z  

```unknown
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[2*n];
5        for(int i=0;i<n;i++){
6           ans[i]=nums[i];
7           ans[i+n]=nums[n-i-1];
8        }
9        return ans;
10    }
11}
```

---

[View on LeetCode](https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/)