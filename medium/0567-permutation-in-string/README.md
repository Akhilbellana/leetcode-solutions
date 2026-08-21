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
**Runtime:** 28 ms (beats 23.18%)  
**Memory:** 47 MB (beats 11.17%)  
**Submitted:** 2026-08-21T14:49:14.588Z  

```java
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0;
        int j=0;
        while(j<s2.length()){
            if(map.containsKey(s2.charAt(j))){
                map.put(s2.charAt(j),map.get(s2.charAt(j))-1);
            }
            if(j-i+1==s1.length()){
                boolean valid=true;
                for(int values:map.values()){
                    if(values!=0){
                         valid=false;
                         break;
                    }
                }
                if(valid){
                    return true;
                }else{
                    if(map.containsKey(s2.charAt(i))){
                        map.put(s2.charAt(i),map.get(s2.charAt(i))+1);
                    }
                    i++;
                }
            }
            j++;
        }
        return false;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/permutation-in-string/)