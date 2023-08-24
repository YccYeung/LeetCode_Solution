class Solution:
    def isPalindrome(self, s: str) -> bool:
        lis = []
        for i , v in enumerate(s):
            if v.isalnum():
                lis.append(v)
        x = ''.join(str(v.lower()) for v in lis)
        return True if x == x[::-1] else False
