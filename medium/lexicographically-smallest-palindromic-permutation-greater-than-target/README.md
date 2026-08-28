# Lexicographically Smallest Palindromic Permutation Greater Than Target

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T05:55:43.499Z  

```unknown
1class Solution {
2    public int romanToInt(String s) {
3        Map<Character,Integer>map=new HashMap<>();
4        map.put('I',1);
5        map.put('V',5);
6        map.put('X',10);
7        map.put('L',50);
8        map.put('C',100);
9        map.put('D',500);
10        map.put('M',1000);
11        int num=map.get(s.charAt(s.length()-1));
12        for(int i=s.length()-1;i>0;i--){
13            if(map.get(s.charAt(i))>map.get(s.charAt(i-1))){
14                num-=map.get(s.charAt(i-1));
15            }else{
16                num+=map.get(s.charAt(i-1));
17
18            }
19        }
20        return num;
21        
22    }
23}
```

---

[View on LeetCode](https://leetcode.com/problems/lexicographically-smallest-palindromic-permutation-greater-than-target/)