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
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 43.1 MB (beats 69.59%)  
**Submitted:** 2026-09-26T09:16:00.062Z  

```java
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[]freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        int val=freq[s.charAt(0)-'a'];
        for(int x:freq){
            if(x!=val && x!=0){
                return false;
            }
        }
        return true;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/)