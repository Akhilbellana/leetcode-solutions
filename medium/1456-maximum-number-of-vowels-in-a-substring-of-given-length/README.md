# Maximum Number of Vowels in a Substring of Given Length

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 
Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.


Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.


Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.


 
Constraints:


	1 <= s.length <= 105
	s consists of lowercase English letters.
	1 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 47.38%)  
**Memory:** 46.2 MB (beats 92.06%)  
**Submitted:** 2026-08-10T10:50:15.042Z  

```java
class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int v=0;
        int max=0;
        while(j<s.length()){
            char a=s.charAt(j);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
                v++;
            }
            if(j-i+1==k){
                char b=s.charAt(i);
                max=Math.max(max,v);
                if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'){
                    v--;
                }
                    i++;
                }
            j++;
         }

        
        return max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)