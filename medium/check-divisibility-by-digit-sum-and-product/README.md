# Check Divisibility By Digit Sum And Product

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T07:03:08.388Z  

```unknown
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sum=0;
4        int temp=n;
5        int product=1;
6        while(n>0){
7            int digit=n%10;
8            sum+=digit;
9            product*=digit;
10            n=n/10;
11        }
12        if(temp%(sum+product)==0){
13            return true;
14        }
15        return false;
16    }
17}
```

---

[View on LeetCode](https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/)