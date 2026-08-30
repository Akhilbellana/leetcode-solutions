# Removing Minimum And Maximum From Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T17:36:24.231Z  

```unknown
1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        int sum=0;
4        for(int i=1;i<num;i++){
5            if(num%i==0){
6                sum+=i;
7            }
8        }
9        if(sum==num)
10            return true;
11        else 
12           return false;
13    }
14}
```

---

[View on LeetCode](https://leetcode.com/problems/removing-minimum-and-maximum-from-array/)