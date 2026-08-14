# Maximum Length Substring With Two Occurrences

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character.
 
Example 1:


Input: s = "bcbbbcba"

Output: 4

Explanation:
The following substring has a length of 4 and contains at most two occurrences of each character: "bcbbbcba".

Example 2:


Input: s = "aaaa"

Output: 2

Explanation:
The following substring has a length of 2 and contains at most two occurrences of each character: "aaaa".

 
Constraints:


	2 <= s.length <= 100
	s consists only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 43.5 MB (beats 70.68%)  
**Submitted:** 2026-08-14T09:12:40.508Z  

```java
class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int i=0;
        int j=0;
        int len=0;
        while(j<s.length()){
            freq[s.charAt(j)-'a']++;
            while(freq[s.charAt(j)-'a']>2){
               freq[s.charAt(i)-'a']--;
                 i++;
               
            }
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/)