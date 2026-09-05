# Smallest Stable Index Ii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T14:15:45.629Z  

```unknown
1class Solution {
2    public boolean sumGame(String num) {
3        int leftq=0;
4        int rightq=0;
5        int leftsum=0;
6        int rightsum=0;
7        int n=num.length();
8        for(int i=0;i<n;i++){
9            if(num.charAt(i)=='?'){
10                if(i<n/2){
11                    leftq++;
12                }else{
13                    rightq++;
14                }
15            }else{
16                if(i<n/2){
17                    leftsum+=(num.charAt(i)-'0');
18                }else{
19                    rightsum+=(num.charAt(i)-'0');
20                }
21            }
22        }
23        int total=leftq+rightq;
24        if(total%2!=0){
25            return true;
26        }
27        int left=2*leftsum+9*leftq;
28        int right=2*rightsum+9*rightq;
29        if(left==right){
30            return false;
31        }
32         return true;
33        
34    }
35}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-stable-index-ii/)