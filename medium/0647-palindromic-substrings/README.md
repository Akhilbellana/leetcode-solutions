# Palindromic Substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return *the number of **palindromic substrings** in it*.

A string is a **palindrome** when it reads the same backward as forward.

A **substring** is a contiguous sequence of characters within the string.

 

**Example 1:**

```
Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".

```

**Example 2:**

```
Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

```

 

**Constraints:**

- 1 <= s.length <= 1000
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 62.51%)  
**Memory:** 42.9 MB (beats 68.43%)  
**Submitted:** 2026-09-18T17:51:41.177Z  

```java
class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int right=i;
            int left=i;
            while(left>=0&&right<=s.length()-1){
                if(s.charAt(left)!=s.charAt(right)){
                    break;
                }
                count++;
                left--;
                right++;
            }
            right=i+1;
            left=i;
            while(left>=0&&right<=s.length()-1){
                if(s.charAt(left)!=s.charAt(right)){
                    break;
                }
                count++;
                left--;
                right++;
            } 
        }
        return count;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindromic-substrings/)