class Solution:
    def isPalindrome(self, x: int) -> bool:
        return True if str(x) == ''.join(reversed(str(x))) else False
