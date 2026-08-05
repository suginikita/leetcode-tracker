// Last updated: 8/5/2026, 2:24:52 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(0, nums, new ArrayList<>(), result);
5        return result;
6    }
7
8    private void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
9        result.add(new ArrayList<>(current));
10
11        for (int i = index; i < nums.length; i++) {
12            current.add(nums[i]);
13            backtrack(i + 1, nums, current, result);
14            current.remove(current.size() - 1);
15        }
16    }
17}