# Check if All Characters Have Equal Number of Occurrences

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return `true`* if *`s`* is a **good** string, or *`false`* otherwise*.

A string `s` is **good** if **all** the characters that appear in `s` have the **same** number of occurrences (i.e., the same frequency).

 

**Example 1:**

```
Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

```

**Example 2:**

```
Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.

```

 

**Constraints:**

- 1 <= s.length <= 1000
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 70.15%)  
**Memory:** 43.5 MB (beats 21.30%)  
**Submitted:** 2026-09-26T09:13:59.804Z  

```java
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[]freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        int val=freq[s.charAt(0)-'a'];
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']!=val){
                return false;
            }
        }
        return true;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/)