// Last updated: 7/27/2026, 3:00:16 PM
1import java.util.*;
2
3class Solution {
4    public String getPermutation(int n, int k) {
5        List<Integer> numbers = new ArrayList<>();
6        int fact = 1;
7        for (int i = 1; i < n; i++) {
8            fact *= i;
9            numbers.add(i);
10        }
11        numbers.add(n);
12
13        k--; 
14
15        StringBuilder ans = new StringBuilder();
16
17        while (true) {
18            int index = k / fact;
19            ans.append(numbers.get(index));
20            numbers.remove(index);
21
22            if (numbers.isEmpty())
23                break;
24
25            k = k % fact;
26            fact = fact / numbers.size();
27        }
28
29        return ans.toString();
30    }
31}