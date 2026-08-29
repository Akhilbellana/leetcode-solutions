# Number of Substrings Containing All Three Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

 
Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 


Example 2:

Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 


Example 3:

Input: s = "abc"
Output: 1


 
Constraints:


	3 <= s.length <= 5 x 104
	s only consists of 'a', 'b' or 'c' characters.

## Solution

**Language:** Java  
**Runtime:** 11 ms (beats 85.47%)  
**Memory:** 46.3 MB (beats 42.16%)  
**Submitted:** 2026-08-29T12:25:13.004Z  

```java
class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int a=0;
        int b=0;
        int c=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(ch=='a'){
                a++;
            }else if(ch=='b'){
                b++;
            }else{
                c++;
            }
            while(a>0 && b>0 && c>0){
                count += s.length() - j;
                 if(s.charAt(i)=='a'){
                a--;
            }else if(s.charAt(i)=='b'){
                b--;
            }else{
                c--;
            }
            i++;
            }
            j++;
            
                    
        }return count;
}

}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/)