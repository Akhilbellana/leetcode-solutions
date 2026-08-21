# Permutation in String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 
Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").


Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false


 
Constraints:


	1 <= s1.length, s2.length <= 104
	s1 and s2 consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-08-21T14:49:09.810Z  

```java
                    if(values!=0){
                }
                         valid=false;
                    }
                         break;
                if(valid){
                    return true;
                }else{
                    if(map.containsKey(s2.charAt(i))){
                for(int values:map.values()){
            if(j-i+1==s1.length()){
            }
                map.put(s2.charAt(j),map.get(s2.charAt(j))-1);
                boolean valid=true;
            if(map.containsKey(s2.charAt(j))){
        while(j<s2.length()){
        int j=0;
        int i=0;
                        map.put(s2.charAt(i),map.get(s2.charAt(i))+1);
                    }
                    i++;
                }
            }
            j++;
        }

```

---

[View on LeetCode](https://leetcode.com/problems/permutation-in-string/)