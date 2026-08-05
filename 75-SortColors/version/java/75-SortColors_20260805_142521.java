// Last updated: 8/5/2026, 2:25:21 PM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        int m = board.length;
4        int n = board[0].length;
5
6        for (int i = 0; i < m; i++) {
7            for (int j = 0; j < n; j++) {
8                if (dfs(board, word, i, j, 0)) {
9                    return true;
10                }
11            }
12        }
13
14        return false;
15    }
16
17    private boolean dfs(char[][] board, String word, int i, int j, int index) {
18        if (index == word.length()) {
19            return true;
20        }
21
22        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
23                || board[i][j] != word.charAt(index)) {
24            return false;
25        }
26
27        char temp = board[i][j];
28        board[i][j] = '#'; // Mark as visited
29
30        boolean found = dfs(board, word, i + 1, j, index + 1)
31                || dfs(board, word, i - 1, j, index + 1)
32                || dfs(board, word, i, j + 1, index + 1)
33                || dfs(board, word, i, j - 1, index + 1);
34
35        board[i][j] = temp; // Restore original value
36
37        return found;
38    }
39}