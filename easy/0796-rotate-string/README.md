# Rotate String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.


	For example, if s = "abcde", then it will be "bcdea" after one shift.


 
Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:
Input: s = "abcde", goal = "abced"
Output: false

 
Constraints:


	1 <= s.length, goal.length <= 100
	s and goal consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-08-20T11:48:22.276Z  

```java
            }
        }
         if(index!=-1){
            for(int j=0;j<s.length();j++){
                if(s.charAt((index+j)%s.length())!=goal.charAt(j)){       
                    return false;
                }
            }
            return true;
                index=i;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==goal.charAt(0)){
         int index=-1;
        if(s.length()!=goal.length()){
        return false;
        }
    }else{
        return false;

```

---

[View on LeetCode](https://leetcode.com/problems/rotate-string/)