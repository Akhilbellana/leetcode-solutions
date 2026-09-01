# Minimum Moves To Clean The Classroom

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T08:26:25.905Z  

```unknown
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i=0;
4        for(int j=1;j<nums.length;j++){
5            if(nums[i]!=nums[j]){
6                i++;
7                nums[i]=nums[j];
8            }
9        } 
10        return i+1;
11    }
12}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-moves-to-clean-the-classroom/)