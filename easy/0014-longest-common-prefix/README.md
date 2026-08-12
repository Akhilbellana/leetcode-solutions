# Longest Common Prefix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"


Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


 
Constraints:


	1 <= strs.length <= 200
	0 <= strs[i].length <= 200
	strs[i] consists of only lowercase English letters if it is non-empty.

## Solution

**Language:** Java  
**Runtime:** 4 ms  
**Memory:** 42.4 MB  
**Submitted:** 2026-08-12T17:27:26.527Z  

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                  if(strs[0].charAt(i)!=strs[j].charAt(i)){
                       return "";
                  }
            }
            }
        
        return s;
            s+=strs[0].charAt(i);
                if(i>=strs[j].length()){
                return s;
              }
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/longest-common-prefix/)