# Cinema Seat Allocation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T19:22:49.345Z  

```unknown
1class Solution {
2    public int subarraySum(int[] nums) {
3        int sum=0;
4        int[] prefix=new int[nums.length+1];
5        prefix[0]=0;
6        for(int i=0;i<nums.length;i++){
7            prefix[i+1]=prefix[i]+nums[i];
8        }
9        for(int i=0;i<nums.length;i++){
10            int start=Math.max(0,i-nums[i]);
11            sum+=prefix[i+1]-prefix[start];
12        }
13        return sum;
14    }
15}
```

---

[View on LeetCode](https://leetcode.com/problems/cinema-seat-allocation/)