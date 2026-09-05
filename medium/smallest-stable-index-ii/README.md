# Smallest Stable Index Ii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T14:10:52.315Z  

```unknown
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int[] min=new int[nums.length];
4        int[] max=new int[nums.length];
5        int maxval=0;
6        int minval=Integer.MAX_VALUE;
7        for(int i=0;i<nums.length;i++){
8            maxval=Math.max(maxval,nums[i]);
9            max[i]=maxval;
10        }
11        for(int i=nums.length-1;i>=0;i--){
12            minval=Math.min(minval,nums[i]);
13            min[i]=minval;
14        }
15        for(int i=0;i<nums.length;i++){
16            if(max[i]-min[i]<=k){
17                return i;
18            }
19        }
20        return -1;
21        
22    }
23}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-stable-index-ii/)