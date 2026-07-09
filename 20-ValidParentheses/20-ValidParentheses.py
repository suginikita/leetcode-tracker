# Last updated: 7/9/2026, 10:06:58 AM
class Solution:
    def isValid(self, s):
        stack = []
        for ch in s:
            if ch == '(' or ch == '{' or ch == '[':
                stack.append(ch)
            else:
                if len(stack) == 0:
                    return False
                top = stack.pop()
                if ch == ')' and top != '(':
                    return False
                if ch == '}' and top != '{':
                    return False
                if ch == ']' and top != '[':
                    return False
        return len(stack) == 0