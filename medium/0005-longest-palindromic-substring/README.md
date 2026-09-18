# Longest Palindromic Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return *the longest* *palindromic* *substring* in `s`.

 

**Example 1:**

```
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

```

**Example 2:**

```
Input: s = "cbbd"
Output: "bb"

```

 

**Constraints:**

- 1 <= s.length <= 1000
- s consist of only digits and English letters.

## Solution

**Language:** Java  
**Runtime:** 18 ms (beats 47.61%)  
**Memory:** 46.2 MB (beats 41.58%)  
**Submitted:** 2026-09-18T08:58:37.293Z  

```java
class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        String ans="";
        for(int i=0;i<s.length();i++){
                int left=i;
                int right=i;
                while(left>=0&&right<=s.length()-1){
                    if(s.charAt(left)!=s.charAt(right)){
                        break;
                    }
                    left--;
                    right++;
                }
                if((right-left-1)>ans.length()){
                    ans=s.substring(left+1,right);    
                }

                left=i;
                right=i+1;
                while(left>=0&&right<=s.length()-1){
                    if(s.charAt(left)!=s.charAt(right)){
                        break;
                    }
                    left--;
                    right++;
            }
                if((right-left-1)>ans.length()){
                    ans=s.substring(left+1,right);    
                }

        }
            
            return ans;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindromic-substring/)