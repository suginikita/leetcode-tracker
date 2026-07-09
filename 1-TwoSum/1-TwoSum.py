# Last updated: 7/9/2026, 10:07:25 AM
class Solution:
    def twoSum(self, nums, target):
        seen = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in seen:
                return [seen[complement], i]
            seen[num] = i
        return []

# Example usage
sol = Solution()
print(sol.twoSum([2, 7, 11, 15], 9))     # Output: [0, 1]
print(sol.twoSum([3, 2, 4], 6))          # Output: [1, 2]
print(sol.twoSum([3, 3], 6))             # Output: [0, 1]