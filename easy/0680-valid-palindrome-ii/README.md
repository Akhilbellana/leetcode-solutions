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
**Runtime:** 4 ms (beats 99.10%)  
**Memory:** 47.7 MB (beats 48.38%)  
**Submitted:** 2026-08-29T03:20:00.619Z  

```java
class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        boolean valid=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                int left=i+1;
                int right=j;
                boolean validleft=true;
                while(left<right){
                    if(s.charAt(left)!=s.charAt(right)){
                        validleft=false;
                        break;
                    }
                    left++;
                    right--;
                
                }
                 left=i;
                 right=j-1;
                 boolean validright=true;
                while(left<right){
                     if(s.charAt(left)!=s.charAt(right)){
                        validright=false;
                        break;
                     }
                     left++;
                     right--;

                }
                return validright||validleft;
                }
                    i++;
                    j--;
                
        }
            return true;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome-ii/)