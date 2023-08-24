class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        for i , v in enumerate(nums):
            if target == v:
                return i
            if target > nums[-1]:
                return len(nums)
            if target < nums[0]:
                return 0
            if target > nums[i] and target <= nums[i+1]:
                return i+1
