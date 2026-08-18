# Find The Largest Almost Missing Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T17:51:10.074Z  

```unknown
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        int sum = 0;
4        Map<Integer, Integer> map = new HashMap<>();
5        map.put(0, -1);
6        for (int i = 0; i < nums.length; i++) {
7            sum += nums[i];
8            int rem = sum % k;
9            if (map.containsKey(rem)) {
10                if(i-map.get(rem)>=2){
11                    return true;
12                }
13
14            }else{
15                map.put(rem,i);
16                }
17        }
18        return false;
19    }
20}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-largest-almost-missing-integer/)