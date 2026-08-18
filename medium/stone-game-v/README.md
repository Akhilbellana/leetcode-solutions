# Stone Game V

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T18:12:10.251Z  

```unknown
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        Map<Integer,Integer>map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k){
6                 return true;
7            }
8            map.put(nums[i],i);
9        
10    }
11    return false;
12}
13}
```

---

[View on LeetCode](https://leetcode.com/problems/stone-game-v/)