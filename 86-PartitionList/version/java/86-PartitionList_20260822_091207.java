// Last updated: 8/22/2026, 9:12:07 AM
1class Solution {
2    
3    public List<List<Integer>> subsetsWithDup(int[] nums) {
4        List<List<Integer>> result = new ArrayList<>();
5        
6        Arrays.sort(nums);
7        
8        backtrack(0, nums, new ArrayList<>(), result);
9        
10        return result;
11    }
12    
13    private void backtrack(int start, int[] nums, 
14                           List<Integer> current,
15                           List<List<Integer>> result) {
16        
17        result.add(new ArrayList<>(current));
18        
19        for (int i = start; i < nums.length; i++) {
20
21            if (i > start && nums[i] == nums[i - 1]) {
22                continue;
23            }
24            
25            current.add(nums[i]);
26            
27            backtrack(i + 1, nums, current, result);
28            current.remove(current.size() - 1);
29        }
30    }
31}