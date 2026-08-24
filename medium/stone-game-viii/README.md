# Stone Game Viii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T10:10:48.745Z  

```unknown
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        long prod=1;
4        int count=0;
5        if(k<=1){
6            return 0;
7        }
8        int i=0;
9        int j=0;
10        while(j<nums.length){
11            prod*=nums[j];
12            while(prod>=k){
13                prod=prod/nums[i];
14                i++;
15            }
16            count+=j-i+1;
17            j++;
18        }
19        return count;
20
21        
22    }
23}
```

---

[View on LeetCode](https://leetcode.com/problems/stone-game-viii/)