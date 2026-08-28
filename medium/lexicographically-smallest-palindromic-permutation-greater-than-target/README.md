# Lexicographically Smallest Palindromic Permutation Greater Than Target

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T09:28:13.410Z  

```unknown
1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        for (int i = 0; i < image.length; i++) {
4            int left = 0;
5            int right = image[i].length - 1;
6            while (left < right) {
7                int temp=image[i][left];
8                image[i][left]=image[i][right];
9                image[i][right]=temp;
10                left++;
11                right--;
12
13            }
14        }
15        for(int i=0;i<image.length;i++){
16            for(int j=0;j<image.length;j++){
17                if(image[i][j]==0){
18                    image[i][j]=1;
19                }else{
20                    image[i][j]=0;
21                }
22            }
23        }
24        return image;
25
26    }
27}
```

---

[View on LeetCode](https://leetcode.com/problems/lexicographically-smallest-palindromic-permutation-greater-than-target/)