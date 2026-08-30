# Removing Minimum And Maximum From Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T17:35:57.894Z  

```unknown
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n=nums.length;
4        int leftsum=0;
5        int rightsum=0;
6        for(int num: nums){
7            rightsum+=num;
8        }
9        int arr[]=new int[n];
10        for(int i=0;i<n;i++){
11            rightsum-=nums[i];
12            arr[i]=Math.abs(leftsum-rightsum);
13            leftsum+=nums[i];
14        }
15        return arr;
16    }
17}
```

---

[View on LeetCode](https://leetcode.com/problems/removing-minimum-and-maximum-from-array/)