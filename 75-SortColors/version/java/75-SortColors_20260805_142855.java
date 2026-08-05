// Last updated: 8/5/2026, 2:28:55 PM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix == null || matrix.length == 0) {
4            return 0;
5        }
6
7        int rows = matrix.length;
8        int cols = matrix[0].length;
9        int[] heights = new int[cols];
10        int maxArea = 0;
11
12        for (int i = 0; i < rows; i++) {
13            for (int j = 0; j < cols; j++) {
14                if (matrix[i][j] == '1') {
15                    heights[j]++;
16                } else {
17                    heights[j] = 0;
18                }
19            }
20
21            maxArea = Math.max(maxArea, largestRectangleArea(heights));
22        }
23
24        return maxArea;
25    }
26
27    private int largestRectangleArea(int[] heights) {
28        Stack<Integer> stack = new Stack<>();
29        int maxArea = 0;
30
31        for (int i = 0; i <= heights.length; i++) {
32            int h = (i == heights.length) ? 0 : heights[i];
33
34            while (!stack.isEmpty() && h < heights[stack.peek()]) {
35                int height = heights[stack.pop()];
36                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
37                maxArea = Math.max(maxArea, height * width);
38            }
39
40            stack.push(i);
41        }
42
43        return maxArea;
44    }
45}