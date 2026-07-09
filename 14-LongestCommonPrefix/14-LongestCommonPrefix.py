# Last updated: 7/9/2026, 10:07:07 AM
class Solution:
    def longestCommonPrefix(self, strs):
        prefix = strs[0]
        for word in strs[1:]:
            while not word.startswith(prefix):
                prefix = prefix[:-1]

                if prefix == "":
                    return ""
        return prefix