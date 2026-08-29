# Valid Palindrome II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string s, return true if the s can be palindrome after deleting at most one character from it.

 
Example 1:

Input: s = "aba"
Output: true


Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.


Example 3:

Input: s = "abc"
Output: false


 
Constraints:


	1 <= s.length <= 105
	s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-08-29T03:17:16.118Z  

```java
                 right=j-1;
                while(left<right){
                     if(s.charAt(left)!=s.charAt(right)){
                        break;
                        validright=false;
                 left=i;
                }
                
                    right--;
                    left++;
                    }
                        break;
                        validleft=false;
                 boolean validright=true;
                    if(s.charAt(left)!=s.charAt(right)){
                while(left<right){

```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome-ii/)