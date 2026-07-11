# Last updated: 7/11/2026, 3:59:02 PM
1class Solution:
2    def multiply(self, num1, num2):
3        if num1 == "0" or num2 == "0":
4            return "0"
5        m = len(num1)
6        n = len(num2)
7        result = [0] * (m + n)
8        for i in range(m - 1, -1, -1):
9            for j in range(n - 1, -1, -1):
10                mul = int(num1[i]) * int(num2[j])
11                pos1 = i + j
12                pos2 = i + j + 1
13                total = mul + result[pos2]
14                result[pos2] = total % 10
15                result[pos1] += total // 10
16        ans = ""
17        for digit in result:
18            if not (ans == "" and digit == 0):
19                ans += str(digit)
20        return ans