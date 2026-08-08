# Maximum Product Of Three Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 67.44%)  
**Memory:** 48.3 MB (beats 9.39%)  
**Submitted:** 2026-08-08T13:14:05.101Z  

```java
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product1=1;
        int product2=1;
        product1=nums[0]*nums[1]*nums[nums.length-1];
        product2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        if(product1>product2){
            return product1;
        }else{
            return product2;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-three-numbers/)