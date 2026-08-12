# String Compression

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:


	If the group's length is 1, append the character to s.
	Otherwise, append the character followed by the group's length.


The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

Note: The characters in the array beyond the returned length do not matter and should be ignored.

 
Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: 6
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
After modifying the input array in-place, the first 6 characters of chars should be ["a","2","b","2","c","3"].


Example 2:

Input: chars = ["a"]
Output: 1
Explanation: The only group is "a", which remains uncompressed since it is a single character.
After modifying the input array in-place, the first character of chars should be ["a"].


Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: 4
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
After modifying the input array in-place, the first 4 characters of chars should be ["a","b","1","2"].


 
Constraints:


	1 <= chars.length <= 2000
	chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.89%)  
**Memory:** 45.3 MB (beats 81.30%)  
**Submitted:** 2026-08-12T19:04:25.514Z  

```java
class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        int write=0;
        while(j<chars.length){
            if(chars[i]!=chars[j]){
                chars[write]=chars[i];
                write++;
                if(j-i>1 &&j-i<=9){
                    chars[write]=(char)('0'+j-i);
                    write++;
                }else if(j-i>=10){
                    String s=String.valueOf(j-i);
                    for(int k=0;k<s.length();k++){
            chars[write]=s.charAt(k);
                 write++;
            }
                }
                i=j;
            }
            j++;
        }
        chars[write]=chars[i];
        write++;
        if((j-i)>1 &&j-i<=9){
        chars[write]=(char)('0'+j-i);
        write++;
        }else if(j-i>=10){
            String s=String.valueOf(j-i);
            for(int k=0;k<s.length();k++){
            chars[write]=s.charAt(k);
                 write++;
            }
        }
        return write;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/string-compression/)