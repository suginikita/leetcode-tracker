// Last updated: 8/22/2026, 9:08:58 AM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        
4        int i = m - 1;   
5        int j = n - 1;      
6        int k = m + n - 1;  
7        
8        while (i >= 0 && j >= 0) {
9            
10            if (nums1[i] > nums2[j]) {
11                nums1[k] = nums1[i];
12                i--;
13            } else {
14                nums1[k] = nums2[j];
15                j--;
16            }
17            
18            k--;
19        }
20    
21        while (j >= 0) {
22            nums1[k] = nums2[j];
23            j--;
24            k--;
25        }
26    }
27}