class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        toReturn = 0

        # base case 1
        if n == 0:
            return 0
        # base case 2
        if n == 1:
            return 1

        # recursive case
        toReturn += n

        return self.fib(n - 1) + self.fib(n - 2)
