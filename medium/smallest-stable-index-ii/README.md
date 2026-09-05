# Smallest Stable Index Ii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T16:59:49.744Z  

```unknown
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max=Integer.MIN_VALUE;
4        int prefix1=1;
5        for(int n:nums){
6            if(prefix1==0){
7                prefix1=1;
8            }
9            prefix1*=n;
10            max=Math.max(max,prefix1);
11        }
12        int prefix2=1;
13        for(int i=nums.length-1;i>=0;i--){
14            if(prefix2==0){
15                prefix2=1;
16            }
17            prefix2*=nums[i];
18            max=Math.max(max,prefix2);
19        }
20        return max;
21        
22    }
23}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-stable-index-ii/)