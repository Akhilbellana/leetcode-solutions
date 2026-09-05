# Smallest Stable Index Ii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T14:08:59.823Z  

```unknown
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int[] min=new int[nums.length];
4        int maxval=0;
5        int minval=Integer.MAX_VALUE;
6        for(int i=nums.length-1;i>=0;i--){
7            minval=Math.min(minval,nums[i]);
8            min[i]=minval;
9        }
10        for(int i=0;i<nums.length;i++){
11            maxval=Math.max(maxval,nums[i]);
12            if(maxval-min[i]<=k){
13                return i;
14            }
15        }
16        return -1;
17        
18    }
19}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-stable-index-ii/)