# Reverse Bits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Reverse bits of a given 32 bits signed integer.

 
Example 1:


Input: n = 43261596

Output: 964176192

Explanation:

IntegerBinary432615960000001010010100000111101001110096417619200111001011110000010100101000000


Example 2:


Input: n = 2147483644

Output: 1073741822

Explanation:

IntegerBinary214748364401111111111111111111111111111100107374182200111111111111111111111111111110


 
Constraints:


	0 <= n <= 231 - 2
	n is even.


 
Follow up: If this function is called many times, how would you optimize it?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 60.37%)  
**Memory:** 42 MB (beats 98.10%)  
**Submitted:** 2026-09-05T14:13:12.751Z  

```java
class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int z = n & 1;
            n = n >> 1;
            ans = ans << 1;
            ans = ans | z;
        }
        return ans;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-bits/)