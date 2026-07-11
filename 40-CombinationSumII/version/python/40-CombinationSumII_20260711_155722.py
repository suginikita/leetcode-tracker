# Last updated: 7/11/2026, 3:57:22 PM
1class Solution:
2    def trap(self, height):
3        left = 0
4        right = len(height) - 1
5
6        left_max = 0
7        right_max = 0
8
9        water = 0
10
11        while left < right:
12
13            if height[left] < height[right]:
14
15                if height[left] >= left_max:
16                    left_max = height[left]
17                else:
18                    water += left_max - height[left]
19
20                left += 1
21
22            else:
23
24                if height[right] >= right_max:
25                    right_max = height[right]
26                else:
27                    water += right_max - height[right]
28
29                right -= 1
30
31        return water