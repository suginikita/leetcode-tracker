# Last updated: 7/9/2026, 10:06:41 AM
from collections import Counter

class Solution:
    def findSubstring(self, s, words):
        if not s or not words:
            return []
        word_len = len(words[0])
        word_count = len(words)
        total_len = word_len * word_count
        word_map = Counter(words)
        result = []
        for i in range(word_len):
            left = i
            current = Counter()
            count = 0
            for j in range(i, len(s) - word_len + 1, word_len):
                word = s[j:j + word_len]
                if word in word_map:
                    current[word] += 1
                    count += 1
                    while current[word] > word_map[word]:
                        left_word = s[left:left + word_len]
                        current[left_word] -= 1
                        count -= 1
                        left += word_len
                    if count == word_count:
                        result.append(left)
                        left_word = s[left:left + word_len]
                        current[left_word] -= 1
                        count -= 1
                        left += word_len
                else:
                    current.clear()
                    count = 0
                    left = j + word_len
        return result