class Solution:
    def reverse(self, x: int) -> int:
        t = abs(x)
        y = str(t)
        z = y[::-1]
        if int(z) >= 2**31 or -int(z) <= -2**31:
            return 0
        if x < 0:
            return -int(z)
        else:
            return int(z)
