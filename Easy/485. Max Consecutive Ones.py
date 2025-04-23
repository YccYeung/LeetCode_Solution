class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        longest = -1
        current_index = 0
        last_index = len(nums) - 1

        for i in range(len(nums)):
            if nums[i] == 0:
                temp_diff = i - current_index
                if temp_diff > longest:
                    longest = temp_diff
                current_index = i + 1

        last_diff = last_index + 1 - current_index
        if last_diff > longest:
            longest = last_diff

        return longest
