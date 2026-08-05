// Last updated: 8/5/2026, 2:21:52 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int left = 0;
7        int right = m * n - 1;
8
9        while (left <= right) {
10            int mid = left + (right - left) / 2;
11
12            int value = matrix[mid / n][mid % n];
13
14            if (value == target) {
15                return true;
16            } else if (value < target) {
17                left = mid + 1;
18            } else {
19                right = mid - 1;
20            }
21        }
22
23        return false;
24    }
25}