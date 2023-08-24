class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n <= 0: 
            return False
        bnum = str(bin(n))
        
        return True if bnum.count("1") == 1 else False
