# Last updated: 7/9/2026, 10:07:22 AM

class Solution:
    def findMedianSortedArrays(self, nums1, nums2):
        # Ensure nums1 is the smaller array
        if len(nums1) > len(nums2):
            nums1, nums2 = nums2, nums1

        m, n = len(nums1), len(nums2)
        low, high = 0, m

        while low <= high:
            i = (low + high) // 2
            j = (m + n + 1) // 2 - i

            max_left_a = float('-inf') if i == 0 else nums1[i - 1]
            min_right_a = float('inf') if i == m else nums1[i]

            max_left_b = float('-inf') if j == 0 else nums2[j - 1]
            min_right_b = float('inf') if j == n else nums2[j]

            if max_left_a <= min_right_b and max_left_b <= min_right_a:
                if (m + n) % 2 == 0:
                    return (max(max_left_a, max_left_b) + min(min_right_a, min_right_b)) / 2.0
                else:
                    return max(max_left_a, max_left_b)
            elif max_left_a > min_right_b:
                high = i - 1
            else:
                low = i + 1        