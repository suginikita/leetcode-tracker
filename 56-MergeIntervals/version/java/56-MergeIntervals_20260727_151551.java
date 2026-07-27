// Last updated: 7/27/2026, 3:15:51 PM
1import java.util.*;
2
3class Solution {
4    public String simplifyPath(String path) {
5        Stack<String> stack = new Stack<>();
6
7        String[] parts = path.split("/");
8
9        for (String part : parts) {
10
11            if (part.equals("") || part.equals(".")) {
12                continue;
13            }
14
15            if (part.equals("..")) {
16                if (!stack.isEmpty()) {
17                    stack.pop();
18                }
19            } else {
20                stack.push(part);
21            }
22        }
23
24        StringBuilder result = new StringBuilder();
25
26        for (String dir : stack) {
27            result.append("/").append(dir);
28        }
29
30        return result.length() == 0 ? "/" : result.toString();
31    }
32}