# Intersection of Two Arrays II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays `nums1` and `nums2`, return *an array of their intersection*. Each element in the result must appear as many times as it shows in both arrays and you may return the result in **any order**.

 

**Example 1:**

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

```

**Example 2:**

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

```

 

**Constraints:**

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

 

**Follow up:**

- What if the given array is already sorted? How would you optimize your algorithm?
- What if nums1's size is small compared to nums2's size? Which algorithm is better?
- What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 47.20%)  
**Memory:** 45.5 MB (beats 9.30%)  
**Submitted:** 2026-09-22T09:21:36.249Z  

```java
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        if(nums1.length>nums2.length){
             for(int x:nums1){
                map.put(x,map.getOrDefault(x,0)+1);
             }
             for(int x:nums2){
                if(map.containsKey(x)){
                    list.add(x);
                    map.put(x,map.get(x)-1);
                    if(map.get(x)==0){
                        map.remove(x);
                    }
                }
             }
        }else{
            for(int x:nums2){
                map.put(x,map.getOrDefault(x,0)+1);
             }
             for(int x:nums1){
                if(map.containsKey(x)){
                    list.add(x);
                    map.put(x,map.get(x)-1);
                    if(map.get(x)==0){
                        map.remove(x);
                    }
                }
             }

        }
        int[] a=new int[list.size()];
        int i=0;
        for(int x:list){
           a[i]=x;
           i++;
        }
        return a;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays-ii/)