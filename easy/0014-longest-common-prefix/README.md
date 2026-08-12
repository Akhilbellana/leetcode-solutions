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
**Runtime:** 3 ms  
**Memory:** 42.8 MB  
**Submitted:** 2026-08-12T10:16:03.175Z  

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i=1;i<strs.length;i++){
            for(int j=0;j<strs.length;j++){
                  if(strs[0].charAt(j)==strs[i].charAt(j)){
            }
            }
        
        String s="";
                    s+=strs[i].charAt(j);
                  }else{
                    return "";
                  }
    }
        return s;
}

```

---

[View on LeetCode](https://leetcode.com/problems/longest-common-prefix/)