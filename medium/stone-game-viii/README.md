# Stone Game Viii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T04:49:37.766Z  

```unknown
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3       if(k<=1)
4          return 0;
5        int product=1;
6        int count=0;
7        int i=0;
8        int n=nums.length;
9       for(int j=0;j<n;j++){
10        product*=nums[j];
11        while(product>=k){
12            product /=nums[i];
13            i++;
14        }
15        count+=j-i+1;
16       }
17       return count;
18    }
19}
```

---

[View on LeetCode](https://leetcode.com/problems/stone-game-viii/)