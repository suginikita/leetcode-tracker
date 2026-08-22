// Last updated: 8/22/2026, 9:18:04 AM
1class Solution {
2    public List<String> restoreIpAddresses(String s) {
3        List<String> result = new ArrayList<>();
4        backtrack(s, 0, 0, "", result);
5        return result;
6    }
7
8    private void backtrack(String s, int index, int parts,
9                           String current, List<String> result) {
10        if (parts == 4) {
11            if (index == s.length()) {
12                result.add(current.substring(0, current.length() - 1));
13            }
14            return;
15        }
16        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
17
18            String part = s.substring(index, index + len);
19            if (part.length() > 1 && part.charAt(0) == '0') {
20                break;
21            }
22
23            int value = Integer.parseInt(part);
24            if (value <= 255) {
25                backtrack(s, index + len, parts + 1,
26                          current + part + ".", result);
27            }
28        }
29    }
30}