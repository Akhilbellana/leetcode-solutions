# Make Lexicographically Smallest Array By Swapping Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T03:19:49.063Z  

```unknown
1class Solution {
2    public boolean validPalindrome(String s) {
3        int i=0;
4        int j=s.length()-1;
5        boolean valid=true;
6        while(i<j){
7            if(s.charAt(i)!=s.charAt(j)){
8                int left=i+1;
9                int right=j;
10                boolean validleft=true;
11                while(left<right){
12                    if(s.charAt(left)!=s.charAt(right)){
13                        validleft=false;
14                        break;
15                    }
16                    left++;
17                    right--;
18                
19                }
20                 left=i;
21                 right=j-1;
22                 boolean validright=true;
23                while(left<right){
24                     if(s.charAt(left)!=s.charAt(right)){
25                        validright=false;
26                        break;
27                     }
28                     left++;
29                     right--;
30
31                }
32                return validright||validleft;
33                }
34                    i++;
35                    j--;
36                
37        }
38            return true;
39
40        
41    }
42}
```

---

[View on LeetCode](https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/)