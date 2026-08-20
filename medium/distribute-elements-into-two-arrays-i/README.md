# Distribute Elements Into Two Arrays I

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T18:11:08.747Z  

```unknown
1class Solution {
2    public int[] resultArray(int[] nums) {
3        List<Integer>list1=new ArrayList<>();
4        List<Integer>list2=new ArrayList<>();
5        list1.add(nums[0]);
6        list2.add(nums[1]);
7        int temp1=nums[0];
8        int temp2=nums[1];
9        for(int i=2;i<nums.length;i++){
10            if(temp1>temp2){
11                list1.add(nums[i]);
12                temp1=nums[i];
13            }else{
14                list2.add(nums[i]);
15                temp2=nums[i];
16            }
17        }
18        int[] a= new int[nums.length];
19        for(int i=0;i<list1.size();i++){
20            a[i]=list1.get(i);
21        }
22        int j=0;
23        for(int i=list1.size();i<nums.length;i++){
24             a[i]=list2.get(j);
25             j++;
26        }
27       
28        return a;
29    }
30}
```

---

[View on LeetCode](https://leetcode.com/problems/distribute-elements-into-two-arrays-i/)