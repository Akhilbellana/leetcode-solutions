# Cinema Seat Allocation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T19:31:44.408Z  

```unknown
1class Solution {
2    public boolean canMakeArithmeticProgression(int[] arr) {
3        Arrays.sort(arr);
4        int d=arr[1]-arr[0];
5        for(int i=0;i<arr.length-1;i++){
6            int j=i+1;
7            if(arr[j]-arr[i]!=d){
8                 return false;
9            }
10        }
11        return true;
12    }
13}
```

---

[View on LeetCode](https://leetcode.com/problems/cinema-seat-allocation/)