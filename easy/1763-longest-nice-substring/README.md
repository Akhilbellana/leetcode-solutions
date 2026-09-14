# Longest Nice Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.

Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.

 
Example 1:

Input: s = "YazaAay"
Output: "aAa"
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.


Example 2:

Input: s = "Bb"
Output: "Bb"
Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.


Example 3:

Input: s = "c"
Output: ""
Explanation: There are no nice substrings.


 
Constraints:


	1 <= s.length <= 100
	s consists of uppercase and lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.8 MB  
**Submitted:** 2026-09-14T06:41:24.397Z  

```java
class Solution {
    public String longestNiceSubstring(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
        Set<Character>set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                set.add(s.charAt(j));
                boolean valid=true;
                for(char ch:set){
                if(!set.contains(Character.toLowerCase(s.charAt(j)))&&!set.contains(Character.
                toUpperCase(s.charAt(j)))){
                    valid=false;
                    break;
                }
                }   
                    if(valid && ans.length()<j-i+1){
                        ans=s.substring(i,j+1);
                    }
                
            }
        }
        return ans;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/longest-nice-substring/)