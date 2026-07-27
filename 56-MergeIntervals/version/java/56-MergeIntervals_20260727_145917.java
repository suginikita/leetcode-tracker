// Last updated: 7/27/2026, 2:59:17 PM
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] matrix = new int[n][n];
4
5        int top = 0;
6        int bottom = n - 1;
7        int left = 0;
8        int right = n - 1;
9
10        int num = 1;
11
12        while (num <= n * n) {
13            for (int i = left; i <= right; i++) {
14                matrix[top][i] = num++;
15            }
16            top++;
17            for (int i = top; i <= bottom; i++) {
18                matrix[i][right] = num++;
19            }
20            right--;
21            if (top <= bottom) {
22                for (int i = right; i >= left; i--) {
23                    matrix[bottom][i] = num++;
24                }
25                bottom--;
26            }
27            if (left <= right) {
28                for (int i = bottom; i >= top; i--) {
29                    matrix[i][left] = num++;
30                }
31                left++;
32            }
33        }
34
35        return matrix;
36    }
37}