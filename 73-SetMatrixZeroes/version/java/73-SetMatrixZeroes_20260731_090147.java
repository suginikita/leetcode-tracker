// Last updated: 7/31/2026, 9:01:47 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        boolean firstColZero = false;
8        for(int i = 0; i < m; i++) {
9
10            if(matrix[i][0] == 0)
11                firstColZero = true;
12
13            for(int j = 1; j < n; j++) {
14                if(matrix[i][j] == 0) {
15                    matrix[i][0] = 0;
16                    matrix[0][j] = 0;
17                }
18            }
19        }
20        for(int i = m - 1; i >= 0; i--) {
21
22            for(int j = n - 1; j >= 1; j--) {
23
24                if(matrix[i][0] == 0 || matrix[0][j] == 0)
25                    matrix[i][j] = 0;
26            }
27
28            if(firstColZero)
29                matrix[i][0] = 0;
30        }
31    }
32}