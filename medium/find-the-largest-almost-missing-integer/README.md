# Find The Largest Almost Missing Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T10:37:41.752Z  

```unknown
1class Solution {
2    public void rotate(int[] nums, int k) {
3       int[]a=new int[nums.length];
4       k=k%nums.length;
5       for(int j=0;j<nums.length;j++){
6        int i=(j+k)%nums.length;
7        a[i]=nums[j];
8       }
9       for(int i=0;i<nums.length;i++){
10        nums[i]=a[i];
11       } 
12    }
13}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-largest-almost-missing-integer/)