# Find The Minimum And Maximum Number Of Nodes Between Critical Points

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T04:41:03.743Z  

```unknown
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int[] prefix=new int[nums.length+1];
4        prefix[0]=0;
5        for(int i=0;i<nums.length;i++){
6            prefix[i+1]=prefix[i]+nums[i];
7        }
8        int[]a =new int[nums.length];
9        for(int i=0;i<nums.length;i++){
10             prefix[i]=Math.abs(prefix[nums.length]-prefix[i+1]-prefix[i]);
11             a[i]=prefix[i];
12        }
13        return a;
14
15        
16    }
17}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/)