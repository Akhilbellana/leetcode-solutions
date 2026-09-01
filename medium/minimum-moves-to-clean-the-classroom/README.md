# Minimum Moves To Clean The Classroom

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T08:25:37.695Z  

```unknown
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int i=0;
4        for(int j=0;j<nums.length;j++){
5            if(nums[j]!=val){
6                nums[i]=nums[j];
7                i++;
8            }
9        }
10        return i;
11    }
12}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-moves-to-clean-the-classroom/)