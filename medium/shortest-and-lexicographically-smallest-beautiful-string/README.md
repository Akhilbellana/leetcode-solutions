# Shortest And Lexicographically Smallest Beautiful String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T17:29:42.255Z  

```unknown
1class Solution {
2    public int reverseBits(int n) {
3        int arr[]=new int[32];
4        int i=0;
5        if(n==0){
6            return 0;
7        }
8        while(n>0){
9            arr[i]=n%2;
10            n/=2;
11            i++;
12        }
13        int res=0;
14        for(int j=0;j<32;j++){
15            res=res*2+arr[j];
16        }
17        return res;
18    }
19}
```

---

[View on LeetCode](https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string/)