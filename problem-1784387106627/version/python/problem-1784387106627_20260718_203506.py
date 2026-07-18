# Last updated: 7/18/2026, 8:35:06 PM
1class Solution:
2    def rearrangeString(self, s: str, x: str, y: str) -> str:
3        y_chars = []
4        other_chars = []
5        x_chars = []
6
7        for ch in s:
8            if ch == y:
9                y_chars.append(ch)
10            elif ch == x:
11                x_chars.append(ch)
12            else:
13                other_chars.append(ch)
14
15        return "".join(y_chars + other_chars + x_chars)