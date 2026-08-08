# Maximum Product Of Three Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** 2 ms  
**Memory:** 42.8 MB  
**Submitted:** 2026-08-08T13:13:59.066Z  

```java
        product1=nums[0]*nums[1]*nums[nums.length-1];
        product2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        if(product1>product2){
            return product1;
        }else{
            return product2;
        }
    }
        int product2=1;
}
        int product1=1;
        Arrays.sort(nums);
    public int maximumProduct(int[] nums) {
class Solution {

```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-three-numbers/)