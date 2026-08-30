# Removing Minimum And Maximum From Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T17:35:39.306Z  

```unknown
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int n=nums.length;
4        int max=Integer.MIN_VALUE;
5        int sum=0;
6        for(int i=0;i<n;i++){
7            sum+=nums[i];
8            if(sum>max){
9                max=sum;
10            }if(sum<0){
11                sum=0;
12            }
13        }
14        return max;
15    }
16}
```

---

[View on LeetCode](https://leetcode.com/problems/removing-minimum-and-maximum-from-array/)