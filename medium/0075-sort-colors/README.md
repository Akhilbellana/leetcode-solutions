# Sort Colors

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 
Example 1:


Input: nums = [2,0,2,1,1,0]

Output: [0,0,1,1,2,2]

Explanation:

The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.


Example 2:


Input: nums = [2,0,1]

Output: [0,1,2]

Explanation:

The array has one each of 0, 1, and 2, arranged in-place in the order 0, 1, 2.


 
Constraints:


	n == nums.length
	1 <= n <= 300
	nums[i] is either 0, 1, or 2.


 
Follow up: Could you come up with a one-pass algorithm using only constant extra space?

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 43 MB  
**Submitted:** 2026-08-25T10:15:45.543Z  

```java
                }
                    nums[i]=temp2;
                    curr++;
            }else if(nums[curr]==0){
                    i++;
                    nums[curr]=nums[i];
                    int temp2=nums[curr];
                if(nums[curr]==0){
                j--;
                nums[j]=1;
                nums[curr]=nums[j];
                int temp1=nums[curr];
            if(nums[curr]==2){
        while(curr<j){
        int j=nums.length-1;
        int curr=0;
                int temp3=nums[curr];
                nums[curr]=nums[i];
                nums[i]=temp3;
                i++;
                curr++;
            }else{
                curr++;
            }
        }
        
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/sort-colors/)