# Stone Game Viii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T04:51:14.285Z  

```unknown
1class Solution {
2    public int lengthOfLastWord(String s) {
3        s=s.trim();
4        int count=0;
5        int n=s.length();
6        for(int i=n-1;i>=0;i--){
7            if(s.charAt(i)!=' '){
8                count++;
9            }else if(count>0){
10                break;
11            }
12        }
13        return count;
14    }
15}
```

---

[View on LeetCode](https://leetcode.com/problems/stone-game-viii/)