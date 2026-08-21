# Find All Anagrams in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

 
Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".


Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".


 
Constraints:


	1 <= s.length, p.length <= 3 * 104
	s and p consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 35 ms (beats 28.09%)  
**Memory:** 48 MB (beats 10.16%)  
**Submitted:** 2026-08-21T17:41:34.888Z  

```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for(char ch:p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0;
        int j=0;
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
            }
            if(j-i+1==p.length()){
                boolean valid=true;
                for(int values:map.values()){
                    if(values!=0){
                        valid=false;
                        break;
                    }
                }
                if(valid){
                    list.add(i);
                }
                if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }
                i++;
            }
            j++;
        }
        return list;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/)