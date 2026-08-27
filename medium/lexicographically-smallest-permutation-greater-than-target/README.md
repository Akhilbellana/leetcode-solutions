# Lexicographically Smallest Permutation Greater Than Target

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T19:20:39.228Z  

```unknown
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] prefix=new int[nums.length];
4        prefix[0]=1;
5        for(int i=1;i<nums.length;i++){
6            prefix[i]=prefix[i-1]*nums[i-1];
7        }
8        int right=1;
9        for(int i=nums.length-1;i>=0;i--){
10            prefix[i]=prefix[i]*right;
11            right=right*nums[i];
12        }
13        
14        return prefix;
15    }
16}
```

---

[View on LeetCode](https://leetcode.com/problems/lexicographically-smallest-permutation-greater-than-target/)