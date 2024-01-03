class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i])) {
                queue.add(nums[i]);
            }
        }

        for (int i = 0; i < set.size(); i++) {
            nums[i] = queue.remove();
        }
        
        return set.size();
    }
}
