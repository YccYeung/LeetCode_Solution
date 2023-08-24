class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        
        s = [str(i) for i in digits]
        x = int(''.join(s))
        y = x + 1
        z = str(y)
        lis1 = []
        for i , v in enumerate(z):
            lis1.append(v)
        return lis1
