// Last updated: 8/22/2026, 9:10:16 AM
1class Solution {
2    public List<Integer> grayCode(int n) {
3        
4        List<Integer> result = new ArrayList<>();
5        
6        for (int i = 0; i < (1 << n); i++) {
7            result.add(i ^ (i >> 1));
8        }
9        
10        return result;
11    }
12}