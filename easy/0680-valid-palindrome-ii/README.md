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
**Memory:** 42.8 MB  
**Submitted:** 2026-08-29T02:44:23.031Z  

```java
class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        boolean valid=true;
        while(i<j && valid){
            if(s.charAt(i)!=s.charAt(j)){
        }
        
                valid=false;
            }
            i++;
            j--;
        if(j-i==1){
            return true;
        }
    }
        return false;
}

```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome-ii/)