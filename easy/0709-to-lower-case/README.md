# To Lower Case

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 
Example 1:

Input: s = "Hello"
Output: "hello"


Example 2:

Input: s = "here"
Output: "here"


Example 3:

Input: s = "LOVELY"
Output: "lovely"


 
Constraints:


	1 <= s.length <= 100
	s consists of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43 MB (beats 51.55%)  
**Submitted:** 2026-09-05T14:10:38.254Z  

```java
class Solution {
    public String toLowerCase(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z'){
            ch=(char)(ch-'A'+'a');
            arr[i]=ch;
        }
        }
        return new String(arr);
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/to-lower-case/)