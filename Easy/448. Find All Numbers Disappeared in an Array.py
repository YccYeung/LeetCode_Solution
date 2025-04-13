class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # dictionary to keep track of seen numbers
        lookup = {}
        # return array for answer
        toReturn = []
        # mark seen number as 1
        for num in nums:
            lookup[num] = 1
        # loop thru. whole array, if number is not in lookup dictionary
        # append it to return array
        for i in range(1, len(nums) + 1):
            if lookup.get(i) != 1:
                toReturn.append(i)
        
        return toReturn
